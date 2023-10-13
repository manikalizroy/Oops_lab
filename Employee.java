class Employee
{
    String name;
    int age,phno,salary;
    String address;

    public Employee(String name,int age,int phno,int salary,String address)
    {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.address = address;
        this.salary = salary;
    }

    public void printsalary()
    {
        System.out.println("Manager's Salary is: " + salary);
    }
}

class Officer extends Employee
{
    String specialization;
    public Officer(String name,int age,int phno,int salary,String address,String specialization)
    {
        super(name,age,phno,salary,address);
        this.specialization = specialization;
    }
    public void printsalary()
    {
        System.out.println("Officer's Salary is: " + salary);
    }


}

class Manager extends Employee
{
    String department;
    public Manager(String name,int age,int phno,int salary,String address,String department)
    {
        super(name,age,phno,salary,address);
        this.department = department;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Officer O1 = new Officer("Liza",40,77567,200000,"Home","AI Specialist");
        Manager M1 = new Manager("Aza",35,646366,400000,"Work","Research wing");

        O1.printsalary();
        M1.printsalary();
    }
}
