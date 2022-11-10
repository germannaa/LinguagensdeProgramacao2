
package NP2.Quest08;

    
public class ContaCorrente implements OperacoesBancarias{
 protected double montante;

    public ContaCorrente() {
        this.montante = 0;
    }

    public ContaCorrente(double valor) {
        this.montante = valor;
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

    

 
}

