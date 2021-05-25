package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ContaDAO {
    private Connection connection;
    
    public ContaDAO() throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Conta conta) {
        String sql = "INSERT INTO conta VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stm = this.connection.prepareStatement(sql);
            stm.setLong(1,conta.getNum());
            stm.setString(2,conta.getNome());
            stm.setFloat(3,conta.getSaldo());
            stm.setLong(4,conta.getNumAgencia());
            
            stm.execute();
            stm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     public List<Conta> getListaConta() {
      try {
          List<Conta> contas = new ArrayList<>();
          PreparedStatement stmt;
          stmt = this.connection.
                  prepareStatement("select * from conta");
          try (ResultSet rs = stmt.executeQuery()) {
              while (rs.next()) {
                  
                  Conta conta = new Conta();
                  conta.setNum(rs.getInt("numero"));
                  conta.setNome(rs.getString("nome"));
                  conta.setSaldo(rs.getFloat("saldo"));
                  conta.setNumAgencia(rs.getLong("numAgencia"));
                  
                  contas.add(conta);
              }
          }
          stmt.close();
          return contas;
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
    }
     
     public static void main(String[] args) throws SQLException {
     }
}
