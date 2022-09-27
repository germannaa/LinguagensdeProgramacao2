package Polimorfismo02;


public class novoImovelCorretor extends novoImovel{
    private Double porcentagem;

    public novoImovelCorretor(Double adicional, Double preco, Double porcentagem) {
        super(adicional, preco);
        this.porcentagem = porcentagem;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }
    
    @Override
     public Double getPrecoImovel(){
        double valorPorcentagem = getPreco() * getPorcentagem();
        return getPreco() + valorPorcentagem + getAdicional();
    }
    
}
