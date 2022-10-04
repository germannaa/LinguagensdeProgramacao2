package Interface01;


public class Teste {
    public static void main(String[] args){
        ContaCorrente germannaConta = new ContaCorrente(1000);
        germannaConta.Depositar(5000);
        germannaConta.Sacar(2500);
        System.out.println("Saldo: " + germannaConta.Saldo());
        
        ContaCorrenteEspecial germanna2Conta = new ContaCorrenteEspecial(1000);
        germanna2Conta.Depositar(5000);
        germanna2Conta.Sacar(2500);
        System.out.println("Saldo: " + germanna2Conta.Saldo());
        
        
    }
}
