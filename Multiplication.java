class Matrix
{
    public int[][] a;
    public int m,n;
    public int i,j,k;


   public Matrix(int[][] x,int y,int z)
   {
         this.a = x;
         this.m= y;
         this.n = z;
   }
    
    Matrix multiply(Matrix B)
    {

        int[][] a = this.a;
        int[][] b = B.a;
        int[][] c = new int[this.m][B.n];
        
        for(i=0;i<this.m;i++)
            for(j=0;j<B.n;j++)
            {
                c[i][j] = 0;
                for(k=0;k<this.n;k++)
                    c[i][j] += a[i][k]*b[k][j];
            }   

     return new Matrix(c, this.m, B.n);
    }
    
public void display()
    {
        
        for(i=0;i<this.m;i++)
        {
            for(j=0;j<this.n;j++)
            {
                System.out.print(this.a[i][j] + " ");
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
        int[][] a = {{1,3},{4,1},{1,1}};
        int[][] b = {{3,2,0},{0,1,2}};
        Matrix A = new Matrix(a,m,n);
        Matrix B = new Matrix(b,p,q);
       
        System.out.println("Matrix A: ");
        A.display();
        System.out.println("Matrix B: ");
        B.display();
        Matrix C = A.multiply(B);
        System.out.println("Product Matrix : ");
        C.display();
    }
}
