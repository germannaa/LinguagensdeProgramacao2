package Encapsulamento01;



public class Teste {

   public static void main (String[] args){
       Conta conta = new Conta(1000);
       conta.depositar(1000);
       conta.sacar(200);
       conta.consultar();
       conta.sacar(2200);
   }
    
}
