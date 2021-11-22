class clac
{
    public int add(int ...n)
    {
        int sum =0;
        for(int i : n)
        {
            sum = sum + i;
        }
        return sum;
    }

}


public class varargsDemo {
    public static void main(String[] args) {
        clac obj = new clac();
        System.out.println(obj.add(45,75,86,83,89,143,77,34,26,47));
    }
}
