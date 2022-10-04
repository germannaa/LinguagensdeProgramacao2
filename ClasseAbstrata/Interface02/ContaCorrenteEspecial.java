package Interface02;

import Interface01.*;


public class ContaCorrenteEspecial extends ContaCorrente{

    public ContaCorrenteEspecial() {
        super();
    }

    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }
    
 
    @Override
    public void Sacar(double valor){
        double total = valor + (0.01 * valor);
        
        if (total>Saldo()){
            System.out.println("Impossivel sacar! Valor maior que saldo. Saldo insufucuente");
        } else {
         montante =montante -  valor - (0.01*valor);
        //System.out.println("Valor sacado = " + valorSacado + "Valor taxa de saque conta corrente: " + taxa + "Valor Saldo total: " + montante);
        
        }}
 
}
