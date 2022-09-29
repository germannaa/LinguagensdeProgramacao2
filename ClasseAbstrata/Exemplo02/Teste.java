package Abstrata02;


public class Teste {
    public static void main(String[]args){
        Employee dev = new Developer();
        Employee gerente = new Manager();
        
        dev.setSalary(6000);
        dev.increaseSalary();
        
        gerente.setSalary(6000);
        gerente.increaseSalary();
    }
}
