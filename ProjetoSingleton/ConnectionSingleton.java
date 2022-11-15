package ProjetoSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/LP2Singleton";
    private String username = "root";
    private String password = "alunoaluno";
    
    private ConnectionSingleton()throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Conexao falhou. Erro: " + e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static ConnectionSingleton getInstance() throws SQLException {
        if (instance == null){
            instance = new ConnectionSingleton();
            System.out.println("Conexao realizada com sucesso.");
        } else if (instance.getConnection().isClosed()){
            instance = new ConnectionSingleton();
        }
        return instance;
    }
    
}
