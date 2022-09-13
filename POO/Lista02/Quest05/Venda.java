
package Lista2_Ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Venda {
    private int codigoVenda;
    public Date data;
    public Cliente cliente;
    public Funcionario funcionario;
    
    public Venda(int codigoVenda){
        this.codigoVenda = codigoVenda;

    }
    
    public int getCodigo(){
        return codigoVenda;
    }
}
