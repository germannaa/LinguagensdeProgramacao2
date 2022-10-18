package Encapsulamento01;


public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    
    public void depositar(double valorDeposito) {
        this.saldo = saldo + valorDeposito;
        System.out.println("Novo saldo após depósito = r$" + saldo);
    }
    
    public void sacar(double valorSaque) {
        if (saldo - valorSaque < 0){
            System.out.print("Saldo insuficiente");
        } 
        else{
        this.saldo = saldo - valorSaque;
        System.out.println("Novo saldo após saque = r$" + saldo);
    }
    }

    public double consultar() {
        return saldo;
    }
    
    
}
