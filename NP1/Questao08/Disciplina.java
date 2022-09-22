package NP1.Quest08;


public class Disciplina {
    public String nomeDisciplina;
    public String codigo;
    public int cargaHoraria;
    public Professor professor;

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nomeDisciplina = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeProfessor() {
        return professor.getNomeProfessor();
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void addProfessor(Professor professor){
        this.professor = professor;
        
    }
    
}
