import java.util.Scanner;

interface Shapes
{
    double pi = 3.14;
    public void shapename();
}

class Shape
{
    public int r;
    public void setR(int r)
    {
        this.r = r;
    }
    public int getR()
    {
        return r;
    }
}
class Circle extends Shape implements Shapes
{
    public void shapename()
    {
        System.out.println("Circle");
    }
    public void area()
    {
        System.out.println("Circle area = "+ pi*r*r);
    }
}
    

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int r = sc.nextInt();
		sc.nextLine();
		Circle c = new Circle();
		c.setR(r);
		c.area();
	}
}
