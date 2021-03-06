

package persistencia;
import entidade.Usuario;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UsuarioDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;
    
    private String cadastraUsuario = "INSERT INTO USUARIO "
                + "(NOME, LOGIN, SENHA)" +
                    "VALUES (?, ?, ?)";
    
    private String consultaUsuario = "SELECT * FROM USUARIO WHERE "
                                        + "NOME LIKE ?";
    
    private String excluiUsuario = "DELETE FROM USUARIO WHERE ID_USUARIO = ?";
    
    private String alteraUsuario = "UPDATE USUARIO SET NOME =?,LOGIN=?,SENHA=?"
            + "WHERE ID_USUARIO=?";
    
    
    public void cadastrarUsuario(Usuario usuario ){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraUsuario);
            pstm.setString(1, usuario.getNome().trim());
            pstm.setString(2, usuario.getLogin().trim());
            pstm.setString(3, usuario.getSenha().trim());
            
            
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }
    
    public List<Usuario> listarUsuarios(String nome) {
         List<Usuario> listaUsuarios = new ArrayList<Usuario>();
         try {
             
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(consultaUsuario);
             pstm.setString(1, nome);
             rs = pstm.executeQuery();
             while (rs.next()){
                 usuario = new Usuario();
                 usuario.setCodigo(rs.getInt("ID_USUARIO"));
                 usuario.setNome(rs.getString("NOME"));
                 usuario.setLogin(rs.getString("LOGIN"));
                 usuario.setSenha(rs.getString("SENHA"));
                 listaUsuarios.add(usuario);
        
             }
         }catch(Exception e) {
                     
           e.printStackTrace();
                     
         }
         
         bd.desconecta();
         return listaUsuarios;
     }
    

     public void excluirUsuario(Usuario usuario){
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(excluiUsuario);
             pstm.setInt(1,usuario.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
            
         }catch(Exception e){
             e.printStackTrace();
         }
    
       
      }
     
      public void alterarUsuario(Usuario usuario){
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(alteraUsuario);
             pstm.setString(1, usuario.getNome().trim());
             pstm.setString(2, usuario.getLogin().trim());
             pstm.setString(3, usuario.getSenha().trim());
             pstm.setInt(4, usuario.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
             
         }catch(Exception e){
             
             e.printStackTrace();
         }
     }
    
}
