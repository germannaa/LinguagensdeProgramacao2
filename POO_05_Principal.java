
package POO.Exemplo04;


public class Principal {
    public static void main(String[]args){
        Professor mauricio = new Professor("Mauricio neto", 001);
        Professor fulano = new Professor ("Fulano", 002);
        Disciplina poo = new Disciplina("Programacao orientada a objeto", 123, mauricio);
        Disciplina lp1 = new Disciplina("LP1", 123, mauricio);
        
        Disciplina poo2 = new Disciplina("Programacao orientada a objeto2", 123, fulano);
        Disciplina lp2 = new Disciplina("LP2", 123, fulano);


        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(lp1);
        fulano.addDisciplina(poo2);
        fulano.addDisciplina(lp2);
        
        
        System.out.println("Disciplinas do " + mauricio.getNomeProfessor());
        mauricio.getMostrarDisciplinas();
        
        System.out.println("Disciplinas do " + fulano.getNomeProfessor());
        fulano.getMostrarDisciplinas();
        

    }
    
}
