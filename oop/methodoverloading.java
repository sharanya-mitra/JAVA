class casio
{
    public void add() {
        System.out.println("yo just do it");
    }
    public void add(int i ,int j)
    {
        System.out.println(i+j);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        casio obj = new casio();
        obj.add();
        obj.add(2, 4);
    }
}
