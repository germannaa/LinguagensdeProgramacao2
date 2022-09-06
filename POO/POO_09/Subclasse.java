package POO.Exemplo08;

public class Subclasse extends SuperClasse{
    public Subclasse(){
        
    }
    
    //subescrever metodo 1 da superclasse
    @Override
    public void metodo1(){
        System.out.println("Chamando metodo 1 da SUBCLASSE");
    }
    
    public void metodo3(){
        System.out.println("Chamando metodo 3 da SUBCLASSE");
    }
    }
