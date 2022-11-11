
package NP2.Quest06;

public abstract class Individuo {

    private static int id = 0;
    public String nome;
    public String curso;

    public Individuo() {
        //Alterar a cada instancia
        this.id = Individuo.incrementoId();
    }

    public Individuo(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
    
    
        
    public static int incrementoId (){
        //id = id ++;
        Individuo.id++;
        System.out.println("Número do id gerado = " + Individuo.id);
        return Individuo.id;
    }

    public int getId() {
        System.out.println("Id do usuário: " + id);
        return Individuo.id;
    }

    public String getNome() {
        return nome;
    }

    public abstract void mostrarDados();
    public abstract void atualizarDados();
        
    
    
}

