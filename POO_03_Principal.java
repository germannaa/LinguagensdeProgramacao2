

package POO.Exemplo02;


public class Aula02PrincipalDisciplina {
    public static void main (String[] args){
        Aula02Disciplina03 lip2 = new Aula02Disciplina03("Linguagens de Programação 02", 12345);
        Aula02Professor03 profMauricio = new Aula02Professor03 ("Mauricio", 001);
        
        lip2.setProfessor(profMauricio);
        
        System.out.println("Nome curso: " + lip2.getNomeDisciplina());
        System.out.println("Nome professor: " + lip2.getNameProfessor());

    }
}
