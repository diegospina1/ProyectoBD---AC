/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Telefonos;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author XIII
 */
public class TelefonosDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    
    public TelefonosDao(){
        
        conectBD = new Conexion();
        this.statement = null;   
    }
    public Telefonos addTel(Telefonos telefono){
        
        Connection con = conectBD.getConexionBD();
        String query = "INSERT telefonos VALUES(null, ?, null)";
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setString(1, telefono.getNumero());
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Se ha agregado un telefono");
            
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

        return telefono;
    }
    
}
