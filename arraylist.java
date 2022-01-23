import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
     ArrayList<string> food = new ArrayList<String>();

     food.add("pizza");
     food.add("friedrice");
     food.add("hotdog");
     food.set(0, "nun");
     food.remove(2);
    //  food.clear();
    for(int i =0 ; i< food.size(); i++)
    {
        System.out.println(food.get(i));
    }
    }
}
