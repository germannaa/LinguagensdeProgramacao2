
package Interface02;

import Interface01.*;


public interface OperacoesBancarias {
    public void Sacar(double valor);       
    public void Depositar(double valor);
    public double Saldo();
    
    //APENAS NA CLASSE PAI!!!!!!
}
