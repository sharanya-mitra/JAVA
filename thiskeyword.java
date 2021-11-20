class cal
{
    int num1;
    int num2;
    public cal(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class thiskeyword {
    public static void main(String[] args) {
     cal obj = new cal(23,55);

     System.out.println(obj.num1);
     System.out.println(obj.num2);
    }
}
