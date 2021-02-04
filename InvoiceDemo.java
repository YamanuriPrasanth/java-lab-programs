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
