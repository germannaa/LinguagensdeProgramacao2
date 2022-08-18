import java.util.Scanner;


public class Aula01_Quest05 {
    
    public static void main(String[]args){
        
        float altura=0, pesoIdeal=0;
        String sexo;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite M para Masculino e F para feminino");
        sexo = in.next();
        sexo = sexo.toLowerCase();
        
        System.out.println("Digite a sua altura:");
        altura = in.nextFloat();
        
        in.close();
        
        switch(sexo){
            case "M":
            case "m":
                pesoIdeal = (float) ((72.7*altura)-58);
                System.out.println("Seu peso ideal seria de:" + pesoIdeal);
                break;
            case "F":
            case "f":
                pesoIdeal = (float) ((62.1*altura)-44.7);
                System.out.println("Seu peso ideal seria de:" + pesoIdeal);
            default:
                System.out.println("Nenhum gênero válido digitado.);
                break;
        }
    }
}
