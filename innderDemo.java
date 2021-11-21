class outer
{
    int a;//member variable 
    public void show()//member method 
    {

    }
    class inner // member class
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

         outer.inner obj1 = obj.new inner();
        obj1.display();
    }
}
