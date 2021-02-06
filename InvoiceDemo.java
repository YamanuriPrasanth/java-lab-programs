1. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of
information as instance variables-a part number(type String),a partdescription(type String),a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor that initializes thefour instance variables. Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoiceamount (i.e., multiplies the quantity by the price per item), then returns the
amount as a double value. If the quantity is not positive, it should be set to 0. Ifthe price per item is not positive, it should be set to 0.0. Write a test application
named InvoiceTest that demonstrates class Invoice’s capabilities.

    
import  java.util.*;
class Invoice
{
    String partNumber;
    String partDescription;
    int itemPurchased;
    double pricePerItem;
    Invoice()
    {
     partNumber="";
     partDescription="";
     itemPurchased=0;
     pricePerItem=0.0;
    }
    String getPartNumber()
    {
        return partNumber;
    }
    String getPartDescription()
    {
        return partDescription;
    }
    int getItemPurchased()
    {
        return itemPurchased;
    }
    double getPricePerItem()
    {
        return pricePerItem;
    }
    double getInvoiceAmount()
    {
        return(itemPurchased*pricePerItem);
    }
    void setPartNumber(String pn)
    {
        partNumber=pn;
    }
    void setPartDescription(String pd)
    {
        partDescription=pd;
    }
    void setItemPurchased(int ip)
    {
        itemPurchased=ip;
    }
    void setPricePerItem(double ppi)
    {
        pricePerItem=ppi;
    }
}
 class InvoiceDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Invoice invoice=new Invoice();
        System.out.println("Enter part number");
        invoice.setPartNumber(sc.nextLine());
        System.out.println("Enter part description");
        invoice.setPartDescription(sc.nextLine());
        System.out.println("Enter Quantity");
        invoice.setItemPurchased(sc.nextInt());
        System.out.println("Enter price per item");
        invoice.setPricePerItem(sc.nextDouble());
        System.out.println("Detail of items in cart");
        System.out.println("part number:"+invoice.getPartNumber());
        System.out.println("Part description:"+invoice.getPartDescription());
        System.out.println("Total Billing Amount:"+invoice.getInvoiceAmount());


    }

}
