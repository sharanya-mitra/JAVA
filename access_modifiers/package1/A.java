package access_modifiers.package1;
import javax.xml.namespace.QName;

import  access_modifiers.package2.*;
public class A {
    protected String protectedmassage = "Hello This from protected C";
    // public static void main(String[] args) {
    //     C c = new C();
    //     // System.out.println(c.defultmassage);
    //     System.out.println(c.publicmassage);
    // }
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.privatemassage);//private
    }
}
