import java.util.Scanner;
import java.util.StringTokenizer;

class Main 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter " + n + "numbers (space seperated)" );
        String nos = sc.nextLine();
        
        int sum =0;
        StringTokenizer st = new StringTokenizer(nos," ");
        System.out.println("The numbers are:" + " ");
        while(st.hasMoreTokens())
        {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num + " ");
            sum = sum + num;
        }
        System.out.println("Sum = " + sum);
    }
    
}
