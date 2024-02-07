//Write a Java program that reads a file and displays the file on the screen, with a line
number before each line.

import java.io.*;

public class Main
{
	public static void main(String[] args) 
	{
	    String fn = "file.txt";
	    try(BufferedWriter w = new BufferedWriter(new FileWriter(fn)))
	    {
	        
	        w.write("Hi, I'm line 1\n");
	        w.write("Hi, I'm line 2\n");
	        w.write("Hi, I'm line 3\n");
	    }
	    catch(IOException e) 
	    {
	        System.err.println("Error: " + e.getMessage());
	    }
	    try 
	    {
	       int lc = 0;
	       BufferedReader br = new BufferedReader(new FileReader(fn)); 
	       String line;
	       while((line = br.readLine()) != null)
	       {
	           lc++;
	           System.out.println("Line number:" +lc+ line);
	       }
	    } 
	    catch(IOException e) 
	    {
	        System.err.println("Error: " + e.getMessage());
	    }
    }
}
