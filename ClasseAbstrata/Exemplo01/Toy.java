
package Abstrata01;


public class Toy extends Product{
//Construtor opcional
    public Toy(String name, double price) {
        super(name, price);
    }

    
    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Toy name: " + name);
        System.out.println("Toy price: " + price);
    }
}
