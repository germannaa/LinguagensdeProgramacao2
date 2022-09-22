package NP1.Quest05;
import java.util.Scanner;

public class NP1Questao05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float salario, prestacao;
        
        System.out.print("Digite o valor do seu salário: ");
        salario = scan.nextFloat();
        
        System.out.print("Digite o valor da prestação do empréstimo: ");
        prestacao = scan.nextFloat();
        
        scan.close();
        
        if (prestacao > 0.2*salario) {
            System.out.println("Empréstimo não concedido!");
        } else {
            System.out.println("Empréstimo concedido!");
        }  
    }
}
