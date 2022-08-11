import java.util.Scanner;

public class Aula01_Quest03 {
    
    public static void main(String[]args){
        
        double nota01, nota02, nota03, media, mediaFinal;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota01 = in.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota02 = in.nextDouble();
        
        media = (nota01+nota02)/2;
        
        if (media >=7){
            System.out.println("Aluno aprovado! Media = " + media);
        }
        else{
            if (media <=4){
                System.out.println("Aluno reprovado! Media = " + media);
            }
            else{
                System.out.println("Tá de recuperação!! Digite a terceira nota:");
                nota03 = in.nextDouble();

                mediaFinal = (nota03 + media)/2;
            
                if (mediaFinal>5){
                   System.out.println("Aluno aprovado! Media = " + media + " MediaFinal = " + mediaFinal);
                }
                else{
                    System.out.println("Aluno reprovado! Media = " + media + " MediaFinal = " + mediaFinal);
                }
                    
            }
            
        }
    }
}
