
package Interface02;

import Interface01.*;


public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais{
 protected double montante;
 protected String nome;
 protected int id;

    public ContaCorrente() {
        this.montante = 0;
        this.nome = nome;
        this.id = 0;
    }

    public ContaCorrente(double montante) {
        this.montante = montante;
        this.nome = nome;
        this.id = 0;
        
    }
 
    public void Depositar(double valor){
        this.montante += valor;
    }
 
    public void Sacar(double valor){
        double total = valor + (0.05 * valor);
        
        if (total>montante){
            System.out.println("Impossivel sacar! Valor maior que saldo. Saldo insufucuente");
        } else {
         this.montante =montante - valor - (0.05*valor);
        //System.out.println("Valor sacado = " + valorSacado + "Valor taxa de saque conta corrente: " + taxa + "Valor Saldo total: " + montante);
        
        }}
 
    public double Saldo(){
        return this.montante;
    }

    
    public void getNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String setNome(String nome) {
        return nome;
    }

    @Override
    public void getId(int id) {
    this.id = id;
    }

    @Override
    public int setId(int id) {
    return id;
    }

  
    

 
}
