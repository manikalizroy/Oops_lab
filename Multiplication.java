class Matmulti
{
    
    int[][] c;
    int i,j,k,n;
    
    void displaymat(int[][] x)
    {
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            {
                 System.out.println(x[i][j] + " "); 
            }
            System.out.println();
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
        System.out.println("Product:");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }    
    }
        
}

public class Main
{
    public static void main(String[] args)
    {
        int n = 2;
        Matmulti m1 = new Matmulti();
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{1,3},{2,1}};
        System.out.println("Matrix A:");
        m1.displaymat(a);
        System.out.println("Matrix B:");
        m1.displaymat(b);
        m1.multiply(a,b);
        m1.printprod();
      
    }
}
