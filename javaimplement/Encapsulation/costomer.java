package javaimplement.Encapsulation;

public class costomer {
public static void main(String[] args) {
    // bike Bike = new bike("R15",15000,"Pulsar");
    bike Bike1 = new bike("R15",15000,"Pulsar");
    // bike Bike2 = new bike("hero",33000,"splender");
    // Bike1.copy(Bike2);
    bike Bike2 = new bike(Bike1);
    System.out.println(Bike1);
    System.out.println(Bike2);
    System.out.println();
    System.out.println(Bike1.getName());
    System.out.println(Bike1.getPrice());
    System.out.println(Bike1.getModel());
    System.out.println();
    System.out.println(Bike2.getName());
    System.out.println(Bike2.getPrice());
    System.out.println(Bike2.getModel());


        // Bike.setName("royal enfield");
        // Bike.setPrice(15000);
        // Bike.setModel("Bullet");

        // System.out.println("Name of bike is "+Bike.getName());
        // System.out.println("Price of bike is "+Bike.getPrice());
        // System.out.println("Model of bike is "+Bike.getModel());
    
}    
}
