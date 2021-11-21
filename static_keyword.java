class emplyoee
{
    int eid;
    int salary;
    String ceo;
    static String company;
    static String performance;
    
    static   // when you load a class

    {
        performance = "good";
    }
    public emplyoee() // when you create an object 
    {
        eid = 1;
        salary = 1000;
    }

public void show()
{
    System.out.println(eid+" : "+ salary + " : " + ceo + " : " + company +" : "+ performance);

}
}

public class static_keyword {
    public static void main(String[] args) {
        
        emplyoee.company ="google";
        
        emplyoee rick = new emplyoee();
        rick.eid = 8;
        // rick.salary = 4000;
        rick.ceo = "naruto";
        

        emplyoee ronne = new emplyoee();
        ronne.eid = 9;
        // ronne.salary=5000; 
        ronne.ceo ="kaneki";

        rick.show();
        
        ronne.show();
    }
}
