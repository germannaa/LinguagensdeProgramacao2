
package POO.Exemplo06;


public class Principal {
    public static void main(String[]args){
        Universidade unichristus = new Universidade("Unichristus");
        
        Disciplina poo = new Disciplina("POO",1);
        
        Estudante germanna = new Estudante ("Germanna");
        Estudante ana = new Estudante ("Ana");
        Estudante joao = new Estudante ("Joao");
        
        poo.addEstudantes(ana);
        
        unichristus.addDisciplinas(poo);
        
        
        
        

        
        
        
    }
    
}
