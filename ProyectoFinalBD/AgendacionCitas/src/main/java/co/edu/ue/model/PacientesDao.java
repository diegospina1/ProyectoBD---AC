package co.edu.ue.model;

import co.edu.ue.entities.Pacientes;
import co.edu.ue.entities.Telefonos;

import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


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
                this.statement.setDate(7, Date.valueOf(paciente.getFecha_adq_plan()));
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
    
    public Pacientes buscarPaciente(int documento_pac){
        
        Pacientes paciente1 = new Pacientes(documento_pac,"","","","", 0,"");
        Connection con = this.conectBD.getConexionBD();
        ResultSet rs;
        String nombre;
        String apellido_p;
        String apellido_m;
        String direccion;
        int cod_plan;
        String fechaPlan;
        String query = "SELECT * FROM pacientes WHERE documento_pac = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_pac);
            rs = this.statement.executeQuery();
            
            
            if(rs.next()){
                
                nombre = rs.getString(2);
                apellido_p = rs.getString(3);
                apellido_m = rs.getString(4);
                direccion = rs.getString(5);
                cod_plan = rs.getInt(6);
                fechaPlan = rs.getString(7);
                
            
                paciente1.setNombre_pac(nombre);
                paciente1.setApellido_paterno(apellido_p);
                paciente1.setApellido_materno(apellido_m);
                paciente1.setDireccion_res(direccion);
                paciente1.setCod_plan(cod_plan);
                paciente1.setFecha_adq_plan(fechaPlan);

                
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
        
        
        return paciente1;
    }
    
    public Pacientes modificarPaciente(Pacientes paciente){
        
        Connection con = this.conectBD.getConexionBD();
        String query = "UPDATE pacientes SET nombre_pac = ?, apellido_paterno=?, apellido_materno=?, "
                + "direccion_rec = ?, cod_plan = ?, fecha_adq_plan = ? WHERE documento_pac= " + paciente.getDocumento_pac();
        try {
            if(this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, paciente.getNombre_pac());
                this.statement.setString(2, paciente.getApellido_paterno());
                this.statement.setString(3, paciente.getApellido_materno());
                this.statement.setString(4, paciente.getDireccion_res());
                this.statement.setInt(5, paciente.getCod_plan());
                this.statement.setString(6, paciente.getFecha_adq_plan());
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
        
        
        return paciente;
    }
    
    public void AsociarPacTel(Telefonos telefono, Pacientes pac){
        
        Connection con = this.conectBD.getConexionBD();
        int documento = pac.getDocumento_pac();
        String numero = telefono.getNumero();
       
        String query = "INSERT INTO contacto_p (cod_telefono, documento_pac) SELECT cod_telefono, documento_pac FROM telefonos,pacientes WHERE pacientes.documento_pac = ?"
                            + " AND telefonos.numero = ?";
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento);
            this.statement.setString(2, numero);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Se ha asociado el contacto del paciente");
               
        } catch (SQLException e) {
            System.out.println(""+e.toString());
        }finally{
            if(con != null){
                try {
                    
                    this.statement.close();
                    con.close();
                    
                } catch (SQLException e) {
                    
                    System.out.println(""+e.toString());
                    
                }
            }
        }
    }
    
    public void DarDeBajaP(int documento_pac){
        
        Connection con = conectBD.getConexionBD();
        String query = "DELETE FROM pacientes WHERE documento_pac = ?" ;
        
        try {
            this.statement = con.prepareStatement(query);
            this.statement.setInt(1, documento_pac);
            int response = this.statement.executeUpdate();
            if(response > 0) JOptionPane.showMessageDialog(null, "Registros del paciente eliminados correctamente");
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
