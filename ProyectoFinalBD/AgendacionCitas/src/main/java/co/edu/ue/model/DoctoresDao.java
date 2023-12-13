package co.edu.ue.model;

import co.edu.ue.entities.Doctores;
import co.edu.ue.entities.Telefonos;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
        Doctores doctor1 = new Doctores(documento_med,"","","");
        Connection con = this.conectBD.getConexionBD();
        ResultSet rs;
        String nombre;
        String apellido_p;
        String apellido_m;
        String query = "SELECT * FROM doctores WHERE documento_med = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_med);
            rs = this.statement.executeQuery();
            
            
            if(rs.next()){
                
                nombre = rs.getString(2);
                apellido_p = rs.getString(3);
                apellido_m = rs.getString("apellido_materno");
            
            
                doctor1.setNombre_med(nombre);
                doctor1.setApellido_paterno(apellido_p);
                doctor1.setApellido_materno(apellido_m);
                
                
            }  
        } catch (SQLException e) {
            
            System.out.println("" + e.toString());
            
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
        
        
        return doctor1;
    }
    
    public Doctores modificarDoctor(Doctores doctor){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "UPDATE doctores SET nombre_med=?, apellido_paterno=?, apellido_materno=? WHERE documento_med= " + doctor.getDocumento_med();
        try {
            if(this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, doctor.getNombre_med());
                this.statement.setString(2, doctor.getApellido_paterno());
                this.statement.setString(3, doctor.getApellido_materno());
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se han actualizado los datos");
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
    
    public void AsociarDocTel(Telefonos telefono, Doctores doc){
        
        Connection con = this.conectBD.getConexionBD();
        int documento = doc.getDocumento_med();
        String numero = telefono.getNumero();
       
        String query = "INSERT INTO contacto_med (cod_telefono, documento_med) SELECT cod_telefono, documento_med FROM telefonos,doctores WHERE doctores.documento_med = ?"
                            + " AND telefonos.numero = ?";
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento);
            this.statement.setString(2, numero);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Se ha asociado el contacto del medico");
               
        } catch (SQLException e) {
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
    }
    
    public void DarDeBajaD(int documento_med){
        
        Connection con = conectBD.getConexionBD();
        String query = "DELETE FROM doctores WHERE documento_med = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_med);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Registros del doctor eliminados correctamente");
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
        
    }
    
}
