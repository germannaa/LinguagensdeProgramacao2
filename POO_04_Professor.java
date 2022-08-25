
package POO.Exemplo03;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    //Atributos
    public Professor disciplina;
    public String nomeProfessor;
    public int idProfessor;
    
    public List<Disciplina> disciplinas;
    
    //Método construtor
    public Professor(String nomeProfessor, int idProfessor){
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        disciplinas = new ArrayList<>();
    }
    
    public int getIdProfessor(){
        return idProfessor;
    }
    
    public String getNomeProfessor(){
        return nomeProfessor;
    }
    
    
}
