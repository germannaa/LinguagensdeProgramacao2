

package POO.Exemplo03;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    //Atributos
    public Professor disciplina;
    public String nomeProfessor;
    public int idProfessor;
    
    //Lista de disciplinas que o professor pode ter
    public List<Disciplina> disciplinas;
    
    //Método construtor
    public Professor(String nomeProfessor, int idProfessor){
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        //Instanciando a lista, com o objeto c o array vazio
        disciplinas = new ArrayList<>();
    }
    
    public int getIdProfessor(){
        return idProfessor;
    }
    
    public String getNomeProfessor(){
        return nomeProfessor;
    }
    
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    
    public void getTodasDisciplinas(){
         System.out.println("Disciplinas do professor:");
        //Um ponteiro
        //Tipo de dado do array, o C é uma variavel de acesso (ponteiro de fato), depois a lista que vai percorrer
        //Um array dinamico, disperso na memoria.
        for(Disciplina c: disciplinas){
           System.out.println(c.nomeDisciplina);
        }
    }
    
    
}
