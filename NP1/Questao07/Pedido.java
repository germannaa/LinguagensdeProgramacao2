
package NP1.Quest07;

import java.util.Date;

public class Pedido {
    public int quantidade;
    public Date data;
    public Float valor;
    public Cliente cliente;

    public Pedido(int quantidade, Date data, Float valor, Cliente cliente) {
        this.quantidade = quantidade;
        //this.data = data;
        data = new Date();
        data.getTime();
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    public float valorTotalPedido() {
        
        float valorTotal;
        valorTotal = quantidade * valor;
        
        return valorTotal;
    }
    
}
