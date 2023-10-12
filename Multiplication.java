class Multipication
{
    private int m,n,p,q;
    private int[][] c;
    
    public Multipication(int m, int n, int p, int q)
    {
        this.m = m;
        this.n = n;
        this.p = p;
        this.q = q;
        c = new int[20][20];
    }
    
    public void display(int[][] x,int m,int n)
    {
        int i,j,k;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    } 
    
    public void multiply(int[][] a,int[][] b)
    {
        int i,j,k;
        for(i=0;i<m;i++)
            for(j=0;j<q;j++)
            {
                c[i][j] = 0;
                for(k=0;k<n;k++)
                    c[i][j] += a[i][k]*b[k][j];
            }     
    }
    
    public void print()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
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
        int m=3,n=2,p=2,q=3;
        Multipication m1 = new Multipication(m,n,p,q);
        int[][] a = {{1,3},{4,1},{1,1}};
        int[][] b = {{3,2,0},{0,1,2}};
        System.out.println("Matrix A: ");
        m1.display(a,m,n);
        System.out.println("Matrix B: ");
        m1.display(b,p,q);
        m1.multiply(a,b);
        System.out.println("Product Matrix : ");
        m1.print();
    }
}
