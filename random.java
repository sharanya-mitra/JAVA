import java.util.Random;
public class random {
    public static void main(String[] args) {
     Random random = new Random();
     int x =random.nextInt();
     double y = random.nextDouble();
     boolean z = random .nextBoolean();
     System.out.println(x+" "+y+" "+z);
    }    
}
