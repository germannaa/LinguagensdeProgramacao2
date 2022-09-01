
package POO.Exemplo05;

import java.util.ArrayList;
import java.util.List;


public class Disciplina {
    public int id_disciplina;
    public String nomeDisciplina;
    public Professor professor;
    public List<Disciplina>disciplinacomPreRequisito;
    public List<Disciplina>PreRequisitodadisciplina;
    
    public Disciplina(int id_disciplina){
        this.id_disciplina = id_disciplina;
        this.nomeDisciplina = nomeDisciplina;
        disciplinacomPreRequisito = new ArrayList<>();
        PreRequisitodadisciplina = new ArrayList<>();

    }
    
    public void setProfessor (Professor professor){
        this.professor = professor;
    }
    
   
    //Associacao Reflexiva (Autoassociacao)
    //Muitos pra muitos
    
    public void addDisciplinaPreRequisito(Disciplina disciplina){
        this.disciplinacomPreRequisito.add(disciplina);
    }
    
    public void addPreRequisito(Disciplina disciplina){
        this.PreRequisitodadisciplina.add(disciplina);
    }
    
    public void showAllDisciplinaPreRequisito(){
        for(Disciplina c: disciplinacomPreRequisito){
            System.out.println(c.disciplinacomPreRequisito);
        }
    }
        
    public void showAllPreRequisitodaDisciplina(){
        for(Disciplina c: PreRequisitodadisciplina){
            System.out.println(c.PreRequisitodadisciplina);
        }
    }
}
