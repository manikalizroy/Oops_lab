class Matmulti
{
    int m,n,p,q;
    int[][] c = new int[m][q];
    int i,j,k;
    
    public Matmulti(int m, int n, int p, int q) {
        this.m = m;
        this.n = n;
        this.p = p;
        this.q = q;
        c = new int[m][q]; // Result matrix dimensions (m x q)
    }
    
    void displaymat(int[][] x,int y,int z)
    {
    	
        for(i=0;i<y;i++)
        {
            for(j=0;j<z;j++)
            {
                 System.out.print(x[i][j] + " "); 
            }
            System.out.println();
        }    
    }
    
    void multiply(int [][] a,int[][] b)
    {
        for(i=0;i<m;i++)
            for(j=0;j<q;j++)
                for(k=0;k<n;k++)
                    c[i][j] += a[i][k]*b[k][j];
    }
    
    void printprod()
    {
        System.out.println("Product:");
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < q; j++) 
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
        int m=3,n = 2,p=2,q=3;
        Matmulti m1 = new Matmulti(m,n,p,q);
        int[][] a = {{1,2},{2,3},{1,1}};
        int[][] b = {{1,3,0},{2,1,3}};
        System.out.println("Matrix A:");
        m1.displaymat(a,m,n);
        System.out.println("Matrix B:");
        m1.displaymat(b,n,q);
        m1.multiply(a,b);
        m1.printprod();
      
    }
}
