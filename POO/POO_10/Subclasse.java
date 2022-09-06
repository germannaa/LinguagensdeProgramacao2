package POO.Exemplo08;

/**
 *
 * @author aluno
 */
public class Subclasse extends SuperClasse{
    public String atributo3;
    
    
    public Subclasse(){
    }
    
    public Subclasse(String atributo1, int atributo2, String atributo3){
        super(atributo1, atributo2);
        this.atributo3=atributo3;
    }
    
    //subescrever metodo 1 da superclasse
    @Override
    public void metodo1(){
        System.out.println("Chamando metodo 1 da SUBCLASSE");
    }
    
    public void metodo3(){
        System.out.println("Chamando metodo 3 da SUBCLASSE");
    }
    
    public void mostrarAtributo(){
        System.out.println("atributo 1:" + atributo1);
        System.out.println("atributo 2:" + atributo2);
        System.out.println("atributo 3:" + atributo3);

    }
    }
