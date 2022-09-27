
package Polimorfismo01;


public class main {
    
    public static void main (String[] args){
        //Instancia aponta aonde o new indica
        Pessoa f1 = new Funcionario("Germanna");
        //Downcast - Apontar diretamente pra funcionario, convertendo
        Funcionario f2 = (Funcionario) f1;
        f2.imprimir();
        //Util pra acessar metodos daquela classe, e nao da super classe
        
        //Estao apontando pro mesmo endereço de memoria, ou seja, estão na mesma classe
        System.out.println(f1);
        System.out.println(f2);
    }
}
