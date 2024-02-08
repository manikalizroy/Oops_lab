//Prints odd and even numbers alternatively

class Num extends Thread
{
    public synchronized void run()
    {
        for(int i = 0;i<=100;i++)
        {
            if(i%2 == 0)
                System.out.println("Even = "+i);
            else
                System.out.println("Odd = "+i);
        }
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	   Num ev = new Num();
	   Num od = new Num();
	   ev.start();
	   od.start();
    }
}
