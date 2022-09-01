
package POO.Exemplo05;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public int id_professor;
    List <Disciplina> disciplinas;
    
    public Professor (int id_professor){
        this.id_professor = id_professor;
        disciplinas = new ArrayList<>();
    }
    public int getIdProfessor(){
        return id_professor;
    }
    
    public void addDisciplinas(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
}
