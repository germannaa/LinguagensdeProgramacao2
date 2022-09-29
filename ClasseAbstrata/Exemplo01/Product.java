package Abstrata01;


public abstract class Product {
    String name;
    double price;
    int id_product;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        id_product = 0;
    }
    
    //Metodos Concretos
    public int getId() {
        return id_product;
    }

    public void setId(int id_product) {
        this.id_product = id_product;
    }
    
    //Metodos Abstratos
    public abstract void update(String name, double price);
    
    public abstract void showInfo();
    
}
