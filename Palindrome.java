class Stringpal
{
    int len=0;
    char[] s;
    boolean pal = true;
    
    
    void findlen(char[] str)
    {
        int i=0;
        s = str;
        for(i=0;s[i]!='\0';i++)
            len++;
    }
    
    boolean checkpal()
    {
    //    boolean pal = true;
        int i=0;
        while(i<len/2)
        {
            
            if(s[i++]!=s[--len])
                pal = false;
        }
        return pal;
    }
    
    void printpal()
    {
        if(pal)
            System.out.println("IS PAL");
        else
            System.out.println("IS NOT PAL");
            
    }
    
}

public class Palindrome
{
    public static void main(String[] args)
    {
        Stringpal s1 = new Stringpal();
        char[] str = {'r','a','d','a','r','\0'};
        s1.findlen(str);
        s1.checkpal();
        s1.printpal();
      
    }
}
