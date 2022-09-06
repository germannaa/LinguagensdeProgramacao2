
package POO.Exemplo07;

public class Calculadora {
 
        public double sum(double a, double b){
            return (double) a+b;
        }
        
        public int sum(int... args){
            int total = 0;
            for(int i:args){
                total+=i;
            }
            return total;
        }
    
    
   public static void main(String[]args){
       Calculadora calc = new Calculadora();
       System.out.println(calc.sum(5.5, 10.7));
       System.out.println(calc.sum(1,2,3,4));
   }
    
}
