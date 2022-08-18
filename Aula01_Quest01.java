import java.util.Scanner;


public class Aula01_Quest01 {
    
    public static void main(String[]args){
        double radiano, graus;
       //final double PI = 3.1415f;
        Scanner in = new Scanner(System.in);
        System.out.println("Valor em graus:");
        graus = in.nextDouble();
        
        radiano = (graus*Math.PI)/180;
        
        System.out.println("Valor em radianos = " + radiano);
    }
    
}
