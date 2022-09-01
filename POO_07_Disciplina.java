
package POO.Exemplo06;

import java.util.ArrayList;
import java.util.List;


public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Disciplina> disciplinas;
    
    public Universidade(String nomeUniversidade){
        this.nomeUniversidade = nomeUniversidade;
        disciplinas = new ArrayList<>();
    }
    
    public void addDisciplinas(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    
    public String getNomeUniversidade(){
        return nomeUniversidade;
    }
    
    public void getNomeDisciplinas(){
        for(Disciplina c: disciplinas){
            System.out.println(c.getNomeDisciplina());
        }
    }
    
    public int getTotalDisciplinas(){
       // int total = 0;
        //for(Disciplina c: disciplinas){
         //   total++;
      //  }
       //System.out.println(total);
       return disciplinas.size();
    }
    
   public int getTotalEstudantes(){
       int totalEstudantes=0;
       for(Disciplina c: disciplinas){
           totalEstudantes += c.estudantes.size();
       }
           return totalEstudantes;
   }
    
    
}
