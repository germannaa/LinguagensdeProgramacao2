package Polimorfismo02;


public class novoImovel extends Imovel{
    private Double adicional;

    public novoImovel( Double preco, Double adicional) {
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
