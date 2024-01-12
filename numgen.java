import java.util.Random;

class Square extends Thread
{
    private int num;
    public Square(int num)
    {
        this.num = num;
    }
    public void run()
    {
        int sq = num*num;
        System.out.println("Square = " + sq);
    }    
}

class Cube extends Thread
{
    private int num;
    public Cube(int num)
    {
        this.num = num;
    }
    public void run()
    {
        int cube = num*num;
        System.out.println("Cube = " + cube);
    }
}

class NumGen
{
    public void Generatenum()
    {
        Random r = new Random();
        while(true){
        int numgen= r.nextInt(10);
        System.out.println("No. generated = " + numgen);
        Square s = new Square(numgen);
        Cube c = new Cube(numgen);
        if(numgen%2 == 0)   
           s.start();
        else
           c.start();
       
        try{
            Thread.sleep(2000);
        }   
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        }
    }    
}

public class Main
{
    public static void main (String[] args) 
    {
        NumGen ng = new NumGen();
        ng.Generatenum();
    }
}
