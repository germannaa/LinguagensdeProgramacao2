
public class aula01_quest07 {
    public static void main(String[] args){
        int somaquad = 0, quadsoma = 0, cont = 1, dif = 0;
        
        while(cont<=10){
            somaquad = somaquad + cont*cont;
            quadsoma = quadsoma + cont;
            cont = cont+1;
        }
        quadsoma = quadsoma*quadsoma;
        dif = quadsoma-somaquad;
        
        System.out.println("Soma dos quadrados = " + somaquad);
        System.out.println("Quadrado das somas = " + quadsoma);
        System.out.println("Quadrado das Somas - Soma dos quadrados = " + dif);
    }
    
}
