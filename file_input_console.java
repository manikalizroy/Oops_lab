//user input from console to a file

import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("output.txt");
            String str = null;
            System.out.println("Enter the statements: ");
            while(!(str = br.readLine()).equals("exit"))
            {
                fw.write(str + "\n");
            }
            fw.close();
        }
        catch(Exception e) 
        {
            e.getMessage();
        }
	}
    
}



/*OUTPUT
Enter the statements: 
huyghvjh
gfthb
exit

--------------------
"output.txt" file content
huyghvjh
gfthb

*/  
