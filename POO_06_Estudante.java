
package POO.Exemplo06;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    public String nomeEstudante;
    public String matricula;
    public Disciplina disciplina;
    
    public Estudante(String nomeEstudante){
        this.nomeEstudante = nomeEstudante;
    }

   
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    public String getNomeEstudante() {
        return nomeEstudante;
    }

    
}
