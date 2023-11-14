import java.util.Scanner;

class BinarySearch
{
    public int binsearch(int [] A,int key)
    {
        int top,bot,mid;
        top = 0;
        bot = A.length - 1;
        
        while(top<=bot)
        {
            mid = (top + bot)/2;
            
            if(A[mid] == key)
            {
                return mid;
            }
            else if(A[mid]<key)
            {
                top = mid + 1; 
            }
            else
            {
                bot = mid - 1;
            }
        }
        
        return -1;
    }
}

public class Main
{
    public static void main (String[] args)
    {
        int i;
        BinarySearch b1 = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        
        //Size of Array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] A = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for(i = 0; i < n; i++)
        {
            A[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to be searched: ");
        int key = scanner.nextInt();
        
        //performing binary search
        int result = b1.binsearch(A,key);
        
        if(result != -1)
        {
            System.out.println(key + " present at " + (result + 1));
        }
        else
        {
            System.out.println(key + " not present in the array");
        }
        
        scanner.close();
        
        
    }    
    
}
