

    package persistencia;
    import entidade.Usuario;
    import fronteira.frmTelaPrincipal;
  import java.util.List;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
//    import javax.swing.JOptionPane;

public class VerificarUsuarioDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;

    
    private String verificaUsuario =  "SELECT LOGIN, SENHA FROM USUARIO WHERE LOGIN =  ? AND SENHA = ?   ";
    
    public boolean verificar(String login, String senha) {
        boolean autenticado = false;
        try{
        bd = new BaseDeDados();
        pstm = bd.conecta().prepareStatement(verificaUsuario);
<<<<<<< HEAD
        pstm.setString(1, LOGIN);
        pstm.setString(2, SENHA);
=======
        pstm.setString(1, login);
        pstm.setString(2, senha);
        
>>>>>>> 2e6ebb52bf3e5c6576b98b55ec1b89c66c541077
        rs = pstm.executeQuery();
        if (rs.next()){
                 usuario = new Usuario();
                 usuario.setLogin(rs.getString("LOGIN"));
                 usuario.setSenha(rs.getString("SENHA"));
                 autenticado = true;
             }
    } catch (Exception e){
        e.printStackTrace(); 
    }  
        bd.desconecta();
        return autenticado;
    }
}
    