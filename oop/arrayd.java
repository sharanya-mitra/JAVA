public class arrayd 
{
    public static void main(String[] args) 
    {
        int arr[][] =
        {
            {32,77,44},
            {22,86,88},
            {28,47,22}      
        };

     for(int i=0;i<3;i++)
     {
         for (int j=0;j<3;j++)
         {
             System.out.print(" " + arr[i][j]);
         }
        System.out.println();
     }                                                                       //      d
     System.out.println();                                                   //  {32,77,44},
     for (int k[] : arr) {                                                   //  {22,86,88},
        for(int l: k)                                                        //  {28,47,22} 
         {
             System.out.print(" " + l);                                      //      k  
         }                                                                   //  {01,02,03,}
         System.out.println();                                               //   enhanced for loop
     }
    }
}
