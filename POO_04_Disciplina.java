
package POO.Exemplo03;


public class Disciplina {
    public Professor professor;
    public String nomeDisciplina;
    public int idDisciplina;
    
    //Método construtor
    public Disciplina(String nomeDisciplina, int idDisciplina, Professor professor){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        this.professor = professor;
    }
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public int getIdDisciplina (){
        return idDisciplina;
    }
}
