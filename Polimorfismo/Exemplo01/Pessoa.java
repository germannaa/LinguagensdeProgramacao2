
package Polimorfismo01;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void imprimir(){
        System.out.println("Pessoa: " + nome);
    }
}
