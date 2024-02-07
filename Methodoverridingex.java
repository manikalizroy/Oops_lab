class Employee
{
    public void display()
    {
        System.out.println("name of class is employee");
    }
    public void calcSalary()
    {
         System.out.println("nsalary of employee is 10000");
    }
}
class Engineer extends Employee
 {
    public void calcSalary()
    {
        System.out.println("nsalary of Engineer is 20000");
    }
 }
 
 public class Main 
 {
    public static void main (String[] args)
    {
        Engineer e = new Engineer();
        e.calcSalary();
        e.display(); //method overriding
    }
 }
 
 
 /* output
 nsalary of Engineer is 20000
name of class is employee
*/
