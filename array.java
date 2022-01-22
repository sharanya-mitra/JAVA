// 1D array
// 2D array
// jagged array

public class array {
    public static void main(String[] args) {
    int num[] = new int[4];
    int nan[] = {23,235,566,76};
    String[] cars = new String[3];
    cars[0] = "Camaro";
    cars[1] = "Corvette";
    cars[2] = "Tesla";
    num[0] = 12;
    num[1] = 16;
    num[2] = 18;
    num[3] = 56;
    
    // num[5] = 63; 

    for(int i=0;i<4;i++)
    {
     System.out.println(num[i]);
    
    }

    for(int i=0;i<4;i++)
    {
     System.out.println(nan[i]);

    }
    for(int i = 0; i<cars.length; i++)
    {
        System.out.println(cars[i]);
    }
    

}
}