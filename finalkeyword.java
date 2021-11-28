final class A //  not inheriteable    
{
    public final void Show() //It can't be overrited now yo.
    {
        System.out.println("in A Show");
    }
}
class B extends A{
// it can't be done right now
}

public class finalkeyword {
    public static void main(String[] args) {
     final int DAY = 13;//Now it act Like a constant 
     System.out.println(DAY);
    }
}
