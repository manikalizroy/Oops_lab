/*Write a Java program that displays the number of characters, lines and words in a text
file.*/

import java.io.BufferedReader;
import java.io.FileReader;

class Main 
{
    public static void main (String[] args)
    {
        try 
        {
           FileReader fr = new FileReader("output.txt");
           BufferedReader br = new BufferedReader(fr);
           String str = null;
           int lc = 0, wc = 0, cc = 0;
           
           while ((str = br.readLine()) != null)
           {
               lc++;
               cc = cc + str.length();
               wc = wc + str.split("\\s+").length;
               
           }
           System.out.println("Line count = " + "" + lc);
           System.out.println("Word count = " + "" + wc);
           System.out.println("Character count = " + "" + cc);
        } 
        catch(Exception e) 
        {
            e.getMessage();
        }
    }
    
}



/* OUTPUT
-----------------------------
Line count = 3
Word count = 8
Character count = 39


-----------------------------
FILE "output.txt" Content
  
Line 1
Hello World
What's wrong with you?

*/  
