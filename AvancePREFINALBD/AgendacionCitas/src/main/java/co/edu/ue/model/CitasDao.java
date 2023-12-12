/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Citas;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author XIII
 */
public class CitasDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    
    public CitasDao(){
        
        conectBD = new Conexion();
        this.statement = null;
    }   
    
    public Citas addCita(Citas cita){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "INSERT citas VALUES(null, ?, ?, ?, ?, ?, null, null)";
        
        try {
            if(this.statement == null){
                
                this.statement = con.prepareStatement(query);
                
                this.statement.setString(1, cita.getNombre_cita());
                this.statement.setDate(2, cita.getFecha_cita());
                this.statement.setString(3, cita.getHora_cita());
                this.statement.setString(4, cita.getDireccion_cita());
                this.statement.setString(5, cita.getConsultorio());
            
                
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
}
