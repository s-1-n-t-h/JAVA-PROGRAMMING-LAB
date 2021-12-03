import java.util.*;
abstract class Accounts
{
    double balance=50000;
    long AcNo = 90897675;
    String AcHN ="Krishna Kishore.K";
    String Add="Moghal Raja Puram,Vijaywada";
    Scanner s = new Scanner(System.in);

    abstract void Withdrawl();
    abstract void deposit();
    void display()
    {
        System.out.println("Name of the Account Holder: "+AcHN);
        System.out.println("Account Number: "+AcNo);
        System.out.println("Available Balence is: "+balance);
    }

}

class Savings extends Accounts
{
    
    void Withdrawl()
    {
        float amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = s.nextFloat();
        if(balance>0)
        {
            balance -= amount;
            System.out.println("Withdwal Succesful. ");
            System.out.println("Balance: "+balance);
        }
        else
        {
            System.out.println("Your Account Balance is $0. No withdwal is possible!");
        }
    }

    void deposit()
    {
        float amount;
        System.out.print("Enter the amount to deposit: ");
        amount = s.nextFloat();

        balance += amount;
        System.out.println("Deposit Succesful. ");
        System.out.println("Your Account Balance is: "+balance);
    }

    public static void main(String[] args)
    {
        
        int c;
        AbsAcc A = new AbsAcc();
        while(true)
        {
            System.out.println("1. Details\n2. Withdrwal\n3. Deposit\n4.Exit");

            c = A.s.nextInt();
            if(c==1)
            {
                A.display();
            }
            else if(c==2)
            {
                A.Withdrawl();
            }
            else if(c==3)
            {
                A.deposit();
            }
            else
            {
                break;
            }
        }
        
        
    }
}