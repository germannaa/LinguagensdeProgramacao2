
package Abstrata02;


public class Developer extends Employee{

    public Developer() {
    }

    @Override
    public void increaseSalary() {
          salary = salary + (salary * 0.5);
          System.out.println("Salario Developer com acrescimo de 50%: " + salary);

    }
}
