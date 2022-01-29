package access_modifiers.package2;
import access_modifiers.package1.*;
public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defultmassage);
        Asub asub = new Asub();
        System.out.println(asub.protectedmassage);
    }
}
    
// Language: java