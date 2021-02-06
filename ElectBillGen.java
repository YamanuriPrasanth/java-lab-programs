2. Develop a Java application to generate Electricity bill. Create a class with thefollowing members: Consumer no., consumer name, previous month reading,
current month reading, and type of EB connection (i.e. domestic or commercial).Compute the bill amount using the following tariff. [CO1]
If the type of the EB connection is domestic, calculate the amount to bepaid as follows:
First 100 units - Rs. 1 per unit
101-200 units - Rs. 2.50 per unit
201 -500 units - Rs. 4 per unit
> 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to bepaid as follows:
First 100 units - Rs. 2 per unit 
101-200 units - Rs. 4.50 per unit
201 -500 units - Rs. 6 per unit
> 501 units - Rs. 7 per unit 




import java.util.Scanner;
class ElectBill
{
    int ConsumerNo;
    String ConsumerName;
    int PrevReading;
    int CurrReading;
    String EBConn;
    double Bill;
    void input_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Consumer Number: ");
        ConsumerNo = sc.nextInt();
        System.out.println("\n Enter Consumer Name: ");
        ConsumerName = sc.next();
        System.out.println("\n Enter Previous Units: ");
        PrevReading = sc.nextInt();
        System.out.println("Enter Current Units consumed:");
        CurrReading = sc.nextInt();
        System.out.println("Enter the types of EB Connection(domestic or commercial)");
        EBConn = sc.next();
    }
    double calculate_bill()
    {
        int choice;
        if(EBConn=="domenstic")
            choice=1;
        else
            choice=2;
        switch(choice)
        {
            case 1: if(CurrReading>=0 && CurrReading<=100)
                Bill=CurrReading*1;
            else if(CurrReading>100 && CurrReading <= 200)
                Bill=(100*1)+((CurrReading-100)*2.50);
            else if(CurrReading>200 && CurrReading <= 500)
                Bill=(100*1)+(100*2.50)+((CurrReading-200)*4);
            else
                Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*6);
                break;
            case 2: if(CurrReading>=0 && CurrReading<=100)
                Bill=CurrReading*2;
            else if(CurrReading>100 && CurrReading <= 200)
                Bill=(100*1)+((CurrReading-100)*4.50);
            else if(CurrReading>200 && CurrReading <= 500)
                Bill=(100*1)+(100*2.50)+((CurrReading-200)*6);
            else
                Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*7);
                break;
        }
        return Bill;
    }
    void display()
    {
        System.out.println("----------------------------------");
        System.out.println("ELCTRICITY BILL");
        System.out.println("----------------------------------");
        System.out.println("Consumer Number: "+ConsumerNo);
        System.out.println("Consumer Name: "+ConsumerName);
        System.out.println("Consumer Previous Units: "+PrevReading);
        System.out.println("Consumer Current Units: "+CurrReading);
        System.out.println("Type of EBConnection: "+EBConn);
        System.out.println("----------------------------------");
        System.out.println("Total Amount(Rs.): "+Bill);
    }
}
public class ElectBillGen
{
    public static void main (String[] args)
    {
        ElectBill b=new ElectBill();
        b.input_data();
        b.calculate_bill();
        b.display();

    }
}
