package NP1.Quest08;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String nomeProfessor;
    public String idProfessor;
    public List<Disciplina> disciplinas;

    public Professor(String nome, String idProfessor) {
        this.nomeProfessor = nome;
        this.idProfessor = idProfessor;        
        disciplinas = new ArrayList<>();
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
    public void mostrarTodasDisciplinasMinistradas(){
         System.out.println("Disciplinas do professor:");
        
        for(Disciplina c: disciplinas){
           //System.out.println(c.nomeDisciplina);
           System.out.println(c.getNomeDisciplina());
        }
    
}
}
