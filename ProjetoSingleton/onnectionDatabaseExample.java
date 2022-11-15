
package ProjetoSingleton;


public class ConnectionDatabaseExample {
    
    public static void main (String[] args){
        ConnectionSingleton conn;
        try{
            conn = ConnectionSingleton.getInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
