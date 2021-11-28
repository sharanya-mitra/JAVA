interface Write
{
    void Write();
}
class Pen implements Write
{
    public void Write()
    {
        System.out.println("I am a pen");
    }
}
class Pencil implements Write
{
    public void Write()
    {
        System.out.println("I am a pencil");
    }
}
class kit 
{
    public void dosomething(Write p)
    {
        p.Write();
    }
}

public class Interfaces {
  public static void main(String[] args) {
      kit k = new kit();
      Pen p = new Pen();
     Pencil pc = new Pencil();

        k.dosomething(pc);
  }  
}
