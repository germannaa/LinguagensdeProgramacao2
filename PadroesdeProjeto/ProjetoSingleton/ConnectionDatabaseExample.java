
package ProjetoSingleton;

import java.sql.SQLException;


public class ConnectionDatabaseExample {
    
    public static void main (String[] args){
        ConnectionSingleton conn;
        ConnectionSingleton conn2;
        
        try{
            conn = ConnectionSingleton.getInstance();
            System.out.println(conn);
            conn2 = ConnectionSingleton.getInstance();
            System.out.println(conn2);
            
            if (conn == conn2) {
                System.out.println("Instâncias iguais!");
            } else {
                System.out.println("Instâncias não são iguais");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
