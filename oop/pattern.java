public class pattern {
    public static void main(String[] args) {
        int n,i,j;
        n=6;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            {
             System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=1;i<=n;i++)
        {   int a=65;
            for(j=1;j<i;j++)
            {
             System.out.print((char)a+" ");
             a++;
            }
            System.out.println();
        }
        System.out.println( );
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <=n; j++)
            {
                if (i == 1 || i == n ||
                    j == 1 || j == n)           
                    System.out.print(" $ ");           
                else
                    System.out.print("   ");           
            }
            System.out.println();
        }
    }
}
