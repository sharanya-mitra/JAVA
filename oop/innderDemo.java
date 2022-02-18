// inner class
// member class
// static class
// Anonymous class -- next class
class outer
{
    int a;//member variable 
    static int b;
    public void show()//member method  public static void show()
    {

    }
    class inner // member class // outer$inner.class
    {
        public void display()// member of member metheod
        {
            System.out.println("in display");
        }
    }
}


public class innderDemo {
    
    //variable,method,calss
    public static void main(String[] args) 
    {
         outer obj = new outer();
         obj.show();

         outer.inner obj1 = obj.new inner();// new outer.inner(); as we talk about if you make a method staic we don't have to make a object
        obj1.display();
    }
}
