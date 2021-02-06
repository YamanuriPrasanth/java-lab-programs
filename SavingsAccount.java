 Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders. Each object of the class contains
a private instance variable savingsBalance indicating the amount the saver currently has ondeposit. Provide method calculateMonthlyInterest to calculate
the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance. Provide a static
method modifyInterestRate that sets the annualInterestRate to a new value.Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest and print the new
balances for both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.

    
    
class SavingsAccount
{
    //variable to store annual interest rate
    static private double annualInterestRate;
    private double savingBalance;

    //constructor method
    public SavingsAccount()
    {
    }

    //constructor method
    public SavingsAccount(double savingBalance)
    {
        this.savingBalance=savingBalance;
    }

    //Get saving balance
    public double getSavingBalance()
    {
        return this.savingBalance;
    }

    //Modify interest rate by setting annual interest rate to a new value
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }

    //Method to calculate monthly interest
    public void calculateMonthlyInterest()
    {
        double monthlyI;
        monthlyI=(double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
    }
}
class Driver {
    public static void main(String[] args) {
        //To test the class designed above
        //Instantiate 2 saving account objects saver1 and saver2
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);
        int total = 0;

        //set tha annual interest rate to 4%=0.04
        SavingsAccount.modifyInterestRate(0.04);

        //calculate monthly interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //print out the new balances for both savers
        System.out.println("This month:\nSaver 1 balance=" + saver1.getSavingBalance());
        System.out.println("saver 2 balance=" + saver2.getSavingBalance());

        //change annual interst rate to 5%=0.05
        SavingsAccount.modifyInterestRate(0.05);

        //calculate the next month interest rate and print out balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next month:/nSaver 1 balance=" + saver1.getSavingBalance());
        System.out.println("Saver 2 balance=" + saver2.getSavingBalance());
    }
}

