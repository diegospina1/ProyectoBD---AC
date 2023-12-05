package co.edu.ue.model;

import co.edu.ue.entities.Doctores;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class DoctoresDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    
    public DoctoresDao(){
        
        conectBD = new Conexion();
        this.statement = null;
    }
    
    public Doctores addDoc(Doctores doctor){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "INSERT doctores VALUES(?,?,?,?)";
        try {
            if(this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setInt(1, doctor.getDocumento_med());
                this.statement.setString(2, doctor.getNombre_med());
                this.statement.setString(3, doctor.getApellido_paterno());
                this.statement.setString(4, doctor.getApellido_materno());
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se ha agregado un doctor");
            }
        } catch (Exception e) {
            System.out.println(""+e.toString());
        }finally{
            if(con != null){
                try {
                    
                    this.statement.close();
                    con.close();
                    
                } catch (Exception e) {
                    
                    System.out.println(""+e.toString());
                    
                }
            }
        }
        return doctor;
    }
    
    public Doctores buscarDoctor(int documento_med){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "SELECT * FROM doctores WHERE documento_med="+documento_med;
        Doctores doctor = new Doctores(); // LO HACES CON STATEMENT
        
        try {
            if(this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setInt(1, doctor.getDocumento_med());
                this.statement.setString(2, doctor.getNombre_med());
                this.statement.setString(3, doctor.getApellido_paterno());
                this.statement.setString(4, doctor.getApellido_materno());
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se ha agregado un doctor");
            }
        } catch (Exception e) {
            System.out.println(""+e.toString());
        }finally{
            if(con != null){
                try {
                    
                    this.statement.close();
                    con.close();
                    
                } catch (Exception e) {
                    
                    System.out.println(""+e.toString());
                    
                }
            }
        }
        
        return doctor;
    }
}
