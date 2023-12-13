/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Telefonos;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String query = "INSERT telefonos VALUES(null, ?, ?)";
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setString(1, telefono.getNumero());
            this.statement.setInt(2, telefono.getCategoria());
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
    
    public Telefonos buscarTelM(int documento_med){
        
        ResultSet rs;
        Telefonos telefono = new Telefonos("",0);
        String numero;
        int categoria;
        Connection con = conectBD.getConexionBD();
        String query = "SELECT telefonos.numero, tel_categorias.cod_categoria FROM contacto_med INNER JOIN telefonos "
                + "ON telefonos.cod_telefono = contacto_med.cod_telefono INNER JOIN tel_categorias "
                + "ON tel_categorias.cod_categoria = telefonos.cod_categoria WHERE contacto_med.documento_med = ?";
        
        try {
            
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_med);
            rs = this.statement.executeQuery();
            
            if(rs.next()){
                
                numero = rs.getString(1);
                categoria = rs.getInt(2);
                
                telefono.setNumero(numero);
                telefono.setCategoria(categoria);
                
            }
        } catch (SQLException e) {
            
            System.out.println(""+e.toString());
            
        } finally{
            
            if(con != null){
                
                try {
                    
                    this.statement.close();
                    con.close();
                    
                } catch (Exception e) {
                    
                    System.out.println("" + e.toString());
                }
            }
        }
        
        return telefono;
    }
    
    public Telefonos buscarTelP(int documento_pac){
        
        ResultSet rs;
        Telefonos telefono = new Telefonos("",0);
        String numero;
        int categoria;
        Connection con = conectBD.getConexionBD();
        String query = "SELECT telefonos.numero, tel_categorias.cod_categoria FROM contacto_p INNER JOIN telefonos "
                + "ON telefonos.cod_telefono = contacto_p.cod_telefono INNER JOIN tel_categorias "
                + "ON tel_categorias.cod_categoria = telefonos.cod_categoria WHERE contacto_p.documento_pac = ?";
        
        try {
            
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_pac);
            rs = this.statement.executeQuery();
            
            if(rs.next()){
                
                numero = rs.getString(1);
                categoria = rs.getInt(2);
                
                telefono.setNumero(numero);
                telefono.setCategoria(categoria);
                
            }
        } catch (SQLException e) {
            
            System.out.println(""+e.toString());
            
        } finally{
            
            if(con != null){
                
                try {
                    
                    this.statement.close();
                    con.close();
                    
                } catch (Exception e) {
                    
                    System.out.println("" + e.toString());
                }
            }
        }
        
        return telefono;
    }
    
    public Telefonos modificarTel(Telefonos telefono, String telViejo){
        
        Connection con = conectBD.getConexionBD();
        String query = "UPDATE telefonos SET numero = ?, cod_categoria = ? WHERE numero = " + telViejo;
        
        try {
            if(this.statement == null){
                
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, telefono.getNumero());
                this.statement.setInt(2, telefono.getCategoria());
                int response = this.statement.executeUpdate();
                if(response > 0) JOptionPane.showMessageDialog(null, "Se han actualizado los datos telefonicos");
                
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
        
        
        
        return telefono;
    }
    
    public void DarDeBajaTel(String numero){
        
        Connection con = conectBD.getConexionBD();
        String query = "DELETE FROM telefonos WHERE numero = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setString(1, numero);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Registros del telefonicos eliminados correctamente");
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
