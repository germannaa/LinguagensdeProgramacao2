

package POO.Exemplo04;

import java.util.List;
import java.util.ArrayList;



public class Disciplina {
    public List<Professor> professores;
    public String nomeDisciplina;
    public int idDisciplina;
    
    //Método construtor
    public Disciplina(String nomeDisciplina, int idDisciplina, Professor professor){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        professores = new ArrayList<>();
    }
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public int getIdDisciplina (){
        return idDisciplina;
    }
    
    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }
    
    public void mostrarProfessor(){
        for (Professor p: professores){
            System.out.println(p.getNomeProfessor());
        }
    }

    
    }

