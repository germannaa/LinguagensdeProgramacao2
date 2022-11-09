
package NP2.Quest05;


public class Produto {
    private static int id = 0;
    private String name;
    
    
    public Produto() {
        //Alterar a cada instancia
        this.id = Produto.geradorId();
    }

    public Produto(String name) {
        this.name = name;
    }
        
    private static int geradorId (){
        Produto.id++;
        //System.out.println("Número do id gerado = " + Produto.id);
        return Produto.id;
    }

    public int getId() {
        System.out.println("Id do usuário: " + id);
        return Produto.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}


