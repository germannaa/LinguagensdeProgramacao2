
package Abstrata01;


public class Ball extends Product{
//Construtor opcional
    public Ball(String name, double price) {
        super(name, price);
    }

    
    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Ball name: " + name);
        System.out.println("Ball price: " + price);
    }
}


