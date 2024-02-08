/*Write a java program where two threads continuously write 10 lines of sentences to the same file.
  Synchronize the threads in such a manner that only one thread is allowed to completely write one line
  and no thread should write two consecutive lines in the file.

  */

import java.io.FileWriter;
import java.io.IOException;


class WriterThread extends Thread
{
    private final String filename;
    private  FileWriter fileWriter;
    private final String[] lines;
    private  int count;
    
    public WriterThread(String filename,String[] lines)
    {
        this.filename = filename;
        this.count = 0;
        this.lines = lines;
        try 
        {
            this.fileWriter = new FileWriter(filename);    
        } 
        catch(IOException e) 
        {
            e.printStackTrace();
        }
        
    }
    public void run()
    {
        while(count<lines.length)
        {
            synchronized (fileWriter)
            {
                try
                {
                    fileWriter.write(lines[count] + "\n");
                    count++;
                    fileWriter.flush();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.getMessage();
                }
            } 
        
        }
        try 
        {
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}    
class Main 
{
    public static void main (String[] args)
    {
        String[] lines = {
            "Line 1",
            "Line 2",
            "Line 3",
            "Line 4",
            "Line 5",
            "Line 6",
            "Line 7",
            "Line 8",
            "Line 9",
            "Line 10"
        };
        String filename = "text.txt";
        WriterThread t1 = new WriterThread(filename,lines);
        WriterThread t2 = new WriterThread(filename, lines);
        
        t1.start();
        t2.start();
    }
    
}

------------------------------------------------------------------------------------------
  //filereading

  import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

class ReaderThread extends Thread
{
    private String fileName = "output.txt";
    private int count;
    private FileReader fileReader;
    private BufferedReader br;
    
    public ReaderThread(String fileName)
    {
        this.fileName = fileName;
        this.count = 0;
        try
        {
            this.br = new BufferedReader(new FileReader(fileName));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void run()
    {
        String line = null;
        try
        {
            while((line = br.readLine()) != null)
            {
                count++;
                System.out.println(count + " - " + line + "\n");
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                br.close();
            }
            catch (IOException e) 
            {
            e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        String fileName = "output.txt";
        ReaderThread t1 = new ReaderThread(fileName);
        t1.start();
        
    }
}
