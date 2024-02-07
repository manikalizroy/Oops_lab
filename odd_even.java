//thread works simultaneously

class Even extends Thread
{
    public void run()
    {
        for(int i = 0;i<=100;i++)
        {
            if(i%2 == 0)
                System.out.println("Even = "+i);
        }
    }
}

class Odd extends Thread
{
    public void run()
    {
        for(int i = 0;i<=100;i++)
        {
            if(i%2 == 1)
                System.out.println("Odd = "+i);
        }
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	   Even ev = new Even();
	   Odd od = new Odd();
	   ev.start();
	   od.start();
    }
}

