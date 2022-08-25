
package POO.Exemplo02;


public class Aula02Disciplina03 {
    //Atributos
    public Aula02Professor03 professor;
    public String nomeDisciplina;
    public int idDisciplina;
    
    //Método construtor
    public Aula02Disciplina03(String nomeDisciplina, int idDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
    }
    
    //Métodos
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public void setProfessor(Aula02Professor03 professor){
        this.professor = professor;
    }
   
    public String getNameProfessor(){
        return professor.nomeProfessor;
    }

    
    
}
