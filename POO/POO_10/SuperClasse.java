
package POO.Exemplo08;


public class SuperClasse {
     public String atributo1;
     public int atributo2;
        
    public SuperClasse(){
       
    }
    
    public SuperClasse(String atributo1, int atributo2){
       this.atributo1=atributo1;
       this.atributo2=atributo2;
    }
    
    
    public void metodo1(){
        System.out.println("Chamando metodo 1 da SUPERCLASSE");
    }
    
    public void metodo2(){
        System.out.println("Chamando metodo 2 da SUPERCLASSE");
    }
}
