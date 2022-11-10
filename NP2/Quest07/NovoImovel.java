
package NP2.Quest07;



public class NovoImovel extends Imovel{
    private Double adicional;

    public NovoImovel( Double preco, Double adicional) {
        super(preco);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }
    
    public Double getValorImovelNovo(){
        return adicional+getPreco();
    }
    
    @Override
     public Double getPrecoImovel(){
        return getPreco() + getAdicional();
    }
  
    
}

