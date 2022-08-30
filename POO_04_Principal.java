package POO.Exemplo03;


public class Principal {
    public static void main(String[]args){
        Professor mauricio = new Professor("Mauricio neto", 001);
        Professor fulano = new Professor ("Fulano", 002);
        Disciplina poo = new Disciplina("Programacao orientada a objeto", 123, mauricio);
        Disciplina lp1 = new Disciplina("LP1", 123, mauricio);

        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(lp1);

        mauricio.getTodasDisciplinas();

    }
    
}
