package Polimorfismo02;


public class main {
    public static void main (String[] args){
        Imovel p1 = new novoImovel(100000.0, 50000.0);
        
        novoImovel p2 = new novoImovelCorretor(200000.0, 10000.0, 0.1);
        
        System.out.println(p2.getValorImovelNovo());
    } 
}
