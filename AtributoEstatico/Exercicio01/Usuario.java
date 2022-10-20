
public class Usuario {
    public static int id = 0;
    private int numUsuario;

    public Usuario() {
        this.numUsuario = Usuario.geradorId();
    }
        
    public static int geradorId (){
        id = id + 1;
        System.out.println("Número do id gerado = " + id);
        return id;
    }

    public int getNumUsuario() {
        return numUsuario;
    }
    
    
}
