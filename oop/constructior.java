class con 
{

    int num1;
    int num2;
    int result;

    public con()
    {
        num1 = 7;
        num2 = 9;
        System.out.println("in constructor");
    }
    public con(int n)
    {
        num1=n;
        num2=n;
    }
    public con(double d,int n)
    {
        num1 = (int)d;
        num2 = n;
    }

    
}
public class constructior
{
    public static void main(String[] args) {

    con obj = new con();//con(5,6);
    System.out.println(obj.num2);  

 }   
}