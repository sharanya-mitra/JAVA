//Encapsulation -> Binding data with methods
class sutudent
{
   private int rollno;
   private String name;

public int getRollno()
{System.out.println("user is accessing the value :");
 return rollno;
}
public void setRollno(int rollno)
{   this.rollno = rollno;
    System.out.println("value of rollno changed :");
  
}
public String getName()
{
 return name;
}
public void setName(String name)
{   this.name = name;//this is used for indicate local method variabale and d 
    System.out.println("name changed :");  
}
}


public class Encapsulation {
    public static void main(String[] args) 
    {
        sutudent s1 =new sutudent();
        s1.setRollno(2);
        s1.setName("Sharanya");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
