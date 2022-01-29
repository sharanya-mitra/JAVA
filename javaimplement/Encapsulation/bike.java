package javaimplement.Encapsulation;
public class bike {
    private String name;
    private int price;
    private String model;
    
    bike(String name,int price,String model)
    {
        this.setName(name);
        this.setPrice(price);
        this.setModel(model);
    }
    bike(bike c)
    {
      this.copy(c);
    }
    public String getName(){
     return name;
    // this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }
    public void setName(String name){
        this.name=name;
     }
    public void setPrice(int price){
        this.price=price;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void copy(bike b){
        this.setModel(b.getModel());
        this.setName(b.getName());
        this.setPrice(b.getPrice());
    }
}
