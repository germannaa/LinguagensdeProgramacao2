
package NP1.Quest06;


public class Produto {
    //Atributos
    String nome;
    String descricao;
    String codigo;
    Float preco;

    //Construtor
    public Produto(String nome, String descricao, String codigo, Float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }
    
    //Metodos
    public void mostrarDadosProduto(){
               
        System.out.println("nome: " + nome + "\ndescricao: " + descricao + "\ncodigo: " + codigo + "\npreco: " + preco);   
    }

    
    public float CalcularTotal(int quantidade){
       Float valorTotal;
       valorTotal = preco*quantidade;
       
       return valorTotal;
    }
}
