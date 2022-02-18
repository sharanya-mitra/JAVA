 class calculator
 {
     public int add(int i,int j) 
     {
      return i+j;   
     }
 }
 
 class calculatoradv extends calculator
 {
    public int sub(int i,int j)
    {
     return i-j;   
    }
}

class calculatorveryadv extends calculatoradv{
    public int mul(int i,int j)
    {
     return i*i;   
    }
}

public class Inheritance {
    public static void main(String[] args) {
     calculatorveryadv obj = new calculatorveryadv();
     int addi = obj.add(45,64);
     int subt = obj.sub(45,64);
     int mult = obj.mul(45,64);
     System.out.println(" "+addi+" "+subt+" "+mult);
    }
}
