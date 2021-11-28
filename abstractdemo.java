class printer
{
    public void show(Number i)
    {
        System.out.println(i);
    }
}
public class abstractdemo {
    public static void main(String[] args) 
    {
        printer obj = new printer();
        obj.show(45);
    }
}
