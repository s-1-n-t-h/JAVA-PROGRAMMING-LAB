import java.util.*;
abstract class Accounts
{
    float balance=50000;
    long AcNo = 90897675;
    String AcHN ="Krishna Kishore.K";
    String Add="Moghal Raja Puram,Vijaywada";
    Scanner s = new Scanner(System.in);

    abstract void Withdrawl();
    abstract void deposit();
    void display()
    {
        System.out.println("\nName of the Account Holder: "+AcHN);
        System.out.println("\nAccount Number: "+AcNo);
        System.out.println("\nAvailable Balence is: "+balance);
    }

}

class Savings extends Accounts
{
    float ri=7.3f;
    float amount;

    void CalAmount()
    {
        amount = balance*ri;
        System.out.println("\nIntrest earned: "+amount);
    }
    void display()
    {
        balance += amount;
        super.display();
    }
    
    void Withdrawl()
    {
        float amount;
        System.out.print("\nEnter the amount to withdraw: ");
        amount = s.nextFloat();
        if(balance>0)
        {
            balance -= amount;
            System.out.println("\nWithdwal Succesful. ");
            System.out.println("\nBalance: "+balance);
        }
        else
        {
            System.out.println("\nYour Account Balance is $0. No withdwal is possible!");
        }
    }

    void deposit()
    {
        float amount;
        System.out.print("\nEnter the amount to deposit: ");
        amount = s.nextFloat();

        balance += amount;
        System.out.println("\nDeposit Succesful. ");
        System.out.println("\nYour Account Balance is: "+balance);
    }

    public static void main(String[] args)
    {
        
        int c;
        Accounts A = new Savings();
        while(true)
        {
            System.out.println("\n1. Details\n2. Withdrwal\n3. Deposit\n4.Over Draft Limit\n5.Exit");

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
            else if(c==4)
            {
                CurrentAccount ca = new CurrentAccount();
                ca.OverDraft();
            }
            else
            {
                break;
            }
        }
        
        
    }
}

class CurrentAccount extends Accounts
{
    float OverDraftLimt = 3000;
    void OverDraft()
    {
        System.out.println("\nThe Overdraft Limit for the Current Account is: "+OverDraftLimt);
        super.display();
    }
    void display()
    {
        super.display();
    }

    void Withdrawl()
    {
        float amount;
        System.out.print("\nEnter the amount to withdraw: ");
        amount = s.nextFloat();
        if(balance>0)
        {
            balance -= amount;
            System.out.println("\nWithdwal Succesful. ");
            System.out.println("\nBalance: "+balance);
        }
        else
        {
            System.out.println("\nYour Account Balance is $0. No withdwal is possible!");
        }
    }

    void deposit()
    {
        float amount;
        System.out.print("\nEnter the amount to deposit: ");
        amount = s.nextFloat();

        balance += amount;
        System.out.println("\nDeposit Succesful. ");
        System.out.println("\nYour Account Balance is: "+balance);
    }

}