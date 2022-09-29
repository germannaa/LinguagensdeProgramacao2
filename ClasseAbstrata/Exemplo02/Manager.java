package Abstrata02;


public class Manager extends Employee{

    public Manager() {
    }

    @Override
    public void increaseSalary() {
        salary = salary + (salary * 0.2);
        System.out.println("Salario Gerente com acrescimo de 20%: " + salary);
    }
    
    
    
}
