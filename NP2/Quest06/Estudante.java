package NP2.Quest06;

public class Estudante extends Individuo{
    
    public Estudante(String nome, String curso){
        super(nome, curso);
}

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Id: " + getId());

    }

    @Override
    public void atualizarDados() {
        this.nome = nome;
        this.curso = curso;
    }
    
   
}

