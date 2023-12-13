package co.edu.ue.model;

import co.edu.ue.entities.LoginUsuario;
import co.edu.ue.principal.Login;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    ResultSet rs;
    
    public LoginDao(){
        
        conectBD = new Conexion();
        this.statement = null;
    }
    
    public boolean checkLogin(LoginUsuario loginU){
        
        Connection con = conectBD.getConexionBD();
        String user;
        String password;
        boolean estado = false;
        String query = "SELECT * FROM login WHERE usuario = ?  AND passwordU = ?";
        
        try {
            
            this.statement = con.prepareStatement(query);
            this.statement.setString(1, loginU.getUsuario());
            this.statement.setString(2, loginU.getPasswordU());
            rs = this.statement.executeQuery();
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "Ingreso correctamente");
                estado = true;
                user = rs.getString("usuario");
                password = rs.getString("passwordU");
                
                loginU.setUsuario(user);
                loginU.setPasswordU(password);
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
        } catch (SQLException e) {
            
            System.out.println("" + e.toString());
        }finally{
            if(con != null){
                try {
                    
                    this.statement.close();
                    con.close();
                } catch (Exception e) {
                    
                    System.out.println("" + e.toString());
                }
            }
        }
        
        
        return estado;
        
    }
}
