package co.edu.ue.model;

import co.edu.ue.entities.Citas;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CitasDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    
    public CitasDao(){
        
        conectBD = new Conexion();
        this.statement = null;
    }   
    
    public Citas addCita(Citas cita){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "INSERT citas VALUES(null, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            if(this.statement == null){
                
                this.statement = con.prepareStatement(query);
                
                this.statement.setString(1, cita.getNombre_cita());
                this.statement.setDate(2, Date.valueOf(cita.getFecha_cita()));
                this.statement.setString(3, cita.getHora_cita());
                this.statement.setString(4, cita.getDireccion_cita());
                this.statement.setString(5, cita.getConsultorio());
                this.statement.setInt(6, cita.getDocumento_med());
                this.statement.setInt(7, cita.getDocumento_pac());
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se ha agregado una cita");
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
        
        
        return cita;
    }
    
    public Citas buscarCita(int cod_cita){
        
        Citas cita = new Citas("","","","","",0,0);
        Connection con = this.conectBD.getConexionBD();
        ResultSet rs;
        String nombre;
        String fecha;
        String hora;
        String direccion;
        String consultorio;
        int documento_med;
        int documento_pac;

        String query = "SELECT * FROM citas WHERE cod_cita = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, cod_cita);
            rs = this.statement.executeQuery();
            
            
            if(rs.next()){
                
                nombre = rs.getString(2);
                fecha = rs.getString(3);
                hora = rs.getString(4);
                direccion = rs.getString(5);
                consultorio = rs.getString(6);
                documento_med = rs.getInt(7);
                documento_pac = rs.getInt(8);
                
            
                cita.setNombre_cita(nombre);
                cita.setFecha_cita(fecha);
                cita.setHora_cita(hora);
                cita.setDireccion_cita(direccion);
                cita.setConsultorio(consultorio);
                cita.setDocumento_pac(documento_pac);
                cita.setDocumento_med(documento_med);
                
                
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
        
        
        return cita;
    }
    
    public Citas modificarCita(Citas cita, int cod_cita_vieja){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "UPDATE citas SET nombre_cita = ?, fecha_cita = ?, hora_cita = ?, "
                + "direccion_cita = ?, consultorio_cita = ? WHERE cod_cita= " + cod_cita_vieja;
        try {
            if(this.statement == null){
                
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, cita.getNombre_cita());
                this.statement.setString(2, cita.getFecha_cita());
                this.statement.setString(3, cita.getHora_cita());
                this.statement.setString(4, cita.getDireccion_cita());
                this.statement.setString(5, cita.getConsultorio());
                
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se ha actualizado la cita");
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
        
        
        return cita;
    }
    
    public void DarDeBajaCita(int cod_cita){
        
        Connection con = conectBD.getConexionBD();
        String query = "DELETE FROM citas WHERE cod_cita = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, cod_cita);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente la cita");
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
