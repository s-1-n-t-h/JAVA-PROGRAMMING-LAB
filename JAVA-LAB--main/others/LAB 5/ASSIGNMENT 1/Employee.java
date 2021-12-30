class Employee{
    String name;int age;String gender;String address;
    void display()
    {
        System.out.println("\nEmployee Name: "+name);
        System.out.println("\nEmployee Age: "+age);
        System.out.println("\nEmployee Gender: "+gender);
        System.out.println("\nEmployee Address: "+address);
    }
    public static void main(String[] args){
        // creating an Full Time Employee Instance
        Full_Time_Employee F = new Full_Time_Employee("K.Rambabu",27,"MALE","10/12/98 - MAdhurawada, Visakhapatnam.",88980,"Senior Software Developer");
        // creating an Part Time Employee Instance
        Partial_Time_Employee P = new Partial_Time_Employee("J.Srivalli",24,"FEMALE","15-89/08 Ratna mamba puram, Guntur District.",6,2500);

        // Displaying the Full Time Employee
        F.display();
        // Displaying the Part Time Employee
        P.display();
    }
}

class Full_Time_Employee extends Employee
{
    float salary;String designation;
    Full_Time_Employee(String name,int age,String gender,String address,float salary,String designation)
    {
        this.name = name;this.age = age;this.gender = gender;this.address = address;
        this.salary = salary;this.designation = designation;
    }
    void display()
    {
        System.out.println("\nFull Time Employee: ");
        super.display();
        System.out.println("\nEmployee Salary: "+salary);
        System.out.println("\nEmployee Designation: "+designation);
    }
}

class Partial_Time_Employee extends Employee
{
    int working_hours;float rate_per_hour;

    Partial_Time_Employee(String name,int age,String gender,String address,int working_hours,float rate_per_hour)
    {
        this.name = name;this.age = age;this.gender = gender;this.address = address;
        this.working_hours = working_hours;this.rate_per_hour = rate_per_hour;
    }

    void Calculate_Pay()
    {
        System.out.println("\nAmount Payable: "+working_hours*rate_per_hour);
    }
    void display()
    {
        System.out.println("\nPart Time Employee: ");
        super.display();
        Calculate_Pay();
    }
}