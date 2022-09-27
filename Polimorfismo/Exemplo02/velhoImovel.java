package Polimorfismo02;


public class velhoImovel extends Imovel{
    private Double desconto;

    public velhoImovel(Double preco, Double desconto) {
        super(preco);
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }
    
    public Double getValorVelhaPropriedade(){
        return getPreco() - desconto;
        //ou getPreco() - getDesconto();
    }
    
    @Override
     public Double getPrecoImovel(){
        return getPreco() - getDesconto();
    }
}
