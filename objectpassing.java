import javax.swing.text.html.HTMLEditorKit.ParserCallback;

class Car
{
    String name;
    Car(String name)
    {
        this.name = name;
    }
}
class Garage{
 void park(Car cnameCar){
        System.out.println("The"+cnameCar.name+"is park");
    }
}

public class objectpassing{
    Garage garage = new Garage();

    Car car1 = new Car("BWM");
    Car car2 = new Car("Tesla");
    garage.park(car1);
    garage.park(car2);


    
}
