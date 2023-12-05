/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Pacientes;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author XIII
 */
public class PacientesDao {
    
    private Conexion conectBD;
    PreparedStatement statement;
    
    public PacientesDao(){
        
        conectBD = new Conexion();
        this.statement = null;
    }
    
    public Pacientes addPaciente(Pacientes paciente){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "INSERT pacientes VALUES(?,?,?,?,?,?,?)";
        try {
            if (this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setInt(1, paciente.getDocumento_pac());
                this.statement.setString(2, paciente.getNombre_pac());
                this.statement.setString(3, paciente.getApellido_paterno());
                this.statement.setString(4, paciente.getApellido_materno());
                this.statement.setString(5, paciente.getDireccion_res());
                this.statement.setInt(6, paciente.getCod_plan());
                this.statement.setString(7, paciente.getFecha_adq_plan());
                int response = this.statement.executeUpdate();
                if (response > 0) JOptionPane.showMessageDialog(null, "Se ha agregado un paciente");
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
        return paciente;
    }
}
