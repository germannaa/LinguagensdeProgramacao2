
package POO.Exemplo03;


public class Disciplina {
    public String nomeDisciplina;
    public int idDisciplina;
    
    //Método construtor
    public Disciplina(String nomeDisciplina, int idDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
    }
    
    public String getNomedisciplina(){
        return nomeDisciplina;
    }
    
    public int getIdDisciplina (){
        return idDisciplina;
    }
}
