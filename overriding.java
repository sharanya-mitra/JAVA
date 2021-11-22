class A
{   int i;
    public void show()
    {   
        System.out.println("in A");
    }
}
class B extends A
{
    // @Override
    int i;
    public void show()
    {   i = 8; //here 8 assin to A class i
        super.i =9;// here 9 assin to A class i 
        super.show();
        System.out.println("in B");
    }
}

public class overriding {
public static void main(String[] args) {
    B obj = new B();
    obj.show();
}    
}
