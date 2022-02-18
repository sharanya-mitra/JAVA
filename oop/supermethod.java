class A 
{
    public A()
    {   //super();
        System.out.println("int A");
    }
    public A(int i)
    {   //super();
        System.out.println("In A INT");
    }
}

class B extends A
{
    public B()
    {   super(5); // every costructor has a super method and now it it will change the super class parameter constructor
        System.out.println("int B");
    }
    public B(int i)
    {   //super(i);
        System.out.println("In B INT");
    }
}
public class supermethod
{
    public static void main(String[] args) {
        {
            B obj = new B();
            B obj1 = new B(4);
        }
    }
}
