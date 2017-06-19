
package cap12;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Login
 */
public class UsuarioDAO {
    
    public Usuario usuario;
    public BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public UsuarioDAO() {
        bd = new BD();
        usuario = new Usuario();
    }
    
    public boolean localizar() {
        
        sql = "select * from usuario where codigo=?";
        
        try {
          
            statement = bd.connection.prepareCall(sql);
            statement.setString(1, usuario.getCodigo());
            resultSet = statement.executeQuery();
            resultSet.next();
            usuario.setCodigo(resultSet.getString(1));
            usuario.setNome(resultSet.getString(2));
            usuario.setEmail(resultSet.getString(3));
            return true;
            
        } catch (SQLException e) {
            
            return false;
            
        }
        
    }
    
    public String atualizar(int operacao) {
        
        men = "Operação realziada com sucesso!";
        
        try {
            
            if (operacao == INCLUSAO) {
                
                sql = "insert into usuario values (?,?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getCodigo());
                statement.setString(2, usuario.getNome());
                statement.setString(3, usuario.getEmail());
                
            } else if (operacao == ALTERACAO) {
                
                sql = "update usuario set nome=?, email=? where codigo=?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getNome());
                statement.setString(2, usuario.getEmail());
                statement.setString(3, usuario.getCodigo());
         
                
            } else if (operacao == EXCLUSAO) {
                
                sql = "delete from usuario where codigo=?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getCodigo());
                
            }
            
            if (statement.executeUpdate() == 0) {
                
                men = "Falha na operação!";
                
            }
            
        } catch (SQLException erro) {
            
            men = "Falha na operação " + erro.toString();
            
        }
        
        return men;
        
    }
    
}
