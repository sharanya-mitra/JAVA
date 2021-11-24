public class wrapperDemo {
    public static void main(String[] args) {
        int b = 20;
        int k = 40;
        Integer obj = b; // boxing warpping

        int c = obj.intValue(); // unboxing unwarpping

        Integer value = k; //autoboxing 

        Integer l = value;//autolunboxing
        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);

        
    }
} 