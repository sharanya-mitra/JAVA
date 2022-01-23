import java.util.*;
public class arraylisttwod {
    public static void main(String[] args) {
      ArrayList<ArrayList<String>> groceryList = new ArrayList();
      ArrayList<String> bakeryList = new ArrayList();
      ArrayList<String> produceList = new ArrayList();

      bakeryList.add("pasta");
      bakeryList.add("donuts");

      produceList.add("cocacola");
      produceList.add("milk");
      groceryList.add(produceList);
      groceryList.add(bakeryList);
      System.out.println(groceryList.get(1).get(0));

    }
}