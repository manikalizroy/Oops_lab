class Matmulti
{
    
    int[][] c;
    int i,j,k;
    
    void displaymat(int[][] x,int n,int n)
    {
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                 System.out.println("Prod:" + x[i][j]);    
    }
    
    void multiply(int [][] a,int[][] b)
    {
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                for(k=0;k<n;k++)
                    c[i][j] += a[i][k]*b[k][j];
    }
    
    void printprod()
    {
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                System.out.println("Prod:" + c[i][j]);    
    }
        
    }
}

public class Palindrome
{
    public static void main(String[] args)
    {
        int n = 2;
        Matmulti m1 = new Matmulti();
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{1,3},{2,1}};
        m1.displaymat(a[][],n,n);
        m1.displaymat(b[][],n,n);
        m1.multiply(a[][],b[][]);
        m1.printprod();
      
    }
}
