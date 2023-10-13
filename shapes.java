abstract class Shape
{
    public int side;
    abstract int numberOfSides();
    
    
}

class rectangle extends Shape
{
    public int numberOfSides()
    {
        super.side = 4;
        return super.side;
    }
}

class triangle extends Shape
{
    public int numberOfSides()
    {
        super.side = 3;
        return super.side;
    }
}

class hexagon extends Shape
{
    public int numberOfSides()
    {
        super.side = 6;
        return super.side;
    }
}

public class Main
{
    public static void main (String[] args) 
    {
        rectangle r1 = new rectangle();
        triangle t1 = new triangle();
        hexagon h1 = new hexagon();
        System.out.println("No. of sides of rect " + r1.numberOfSides());
        System.out.println("No. of sides of triangle " + t1.numberOfSides());
        System.out.println("No. of sides of hexagon " + h1.numberOfSides());
    }
}
