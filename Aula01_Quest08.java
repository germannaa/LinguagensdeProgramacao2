import java.util.Scanner;

public class aula01_quest08 {
        public static void main(String[]args){
            
        Scanner input = new Scanner(System.in);
        
        float serieHarm = 0;
        int n, i;
        
        System.out.println("Digite a repetição da série:");
        n = input.nextInt();
        
        for (i = 1; i<=n; i++){
            serieHarm = serieHarm + (float)1/i;
        }
        System.out.println("Valor da Série Harmonica: "+ serieHarm);
        }
        

}
