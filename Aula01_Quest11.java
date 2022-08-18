import java.util.Scanner;


public class aula01_quest11 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int  soma = 0;
        int [][] matriz = new int [3][3];
        
        for (int i = 0; i<3; i++){
            for (int a = 0; a<3; a++){
                System.out.println("Escreva o valor da [" + i + "][" + a + "]:");
                matriz[i][a] = input.nextInt();
            }
        }
         soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
         
         System.out.println("Soma da [0][0] + [1][1] + [2][2] = " + soma);
       
        
    }
}
