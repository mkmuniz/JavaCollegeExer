package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            return
                    DriverManager.getConnection("jdbc:derby://localhost:1527/sistema_bancario", "app", "app");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não carregou");
        }
        return null;
    }
}
