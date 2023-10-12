class Freq
{
    private char[] s;
    private int[] freq = new int[256];
    private int len=0,i;

    public Freq(char[] c)
    {
        this.s =c;
    }
    
    public void stringlen()
    {
        for(i=0;s[i]!='\0';i++)
            len++;
    }
    
    public void freqlen()
    {
        int i = 0;
        for(i=0;i<len;i++)
            freq[s[i]]++;
        for(i=0;i<256;i++)
            if(freq[i]>0)
                System.out.println((char)i + " " + freq[i]);
    }
    
}

public class Main
{
    public static void main(String[] args)
    {
        char[] c = {'r','a','d','a','r','\0'};
        Freq f1 = new Freq(c);
        f1.stringlen();
        f1.freqlen();
    }
}
