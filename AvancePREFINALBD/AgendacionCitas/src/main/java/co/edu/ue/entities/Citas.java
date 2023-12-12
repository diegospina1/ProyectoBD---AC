/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.entities;



/**
 *
 * @author XIII
 */
public class Citas {
    
    String nombre_cita;
    java.sql.Date fecha_cita;
    String hora_cita;
    String direccion_cita;
    String consultorio;

    public Citas(String nombre_cita, java.sql.Date fecha_cita, String hora_cita, String direccion_cita, String consultorio) {
        this.nombre_cita = nombre_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.direccion_cita = direccion_cita;
        this.consultorio = consultorio;
    }

    public String getNombre_cita() {
        return nombre_cita;
    }

    public void setNombre_cita(String nombre_cita) {
        this.nombre_cita = nombre_cita;
    }

    public java.sql.Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(java.sql.Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    
    public String getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    public String getDireccion_cita() {
        return direccion_cita;
    }

    public void setDireccion_cita(String direccion_cita) {
        this.direccion_cita = direccion_cita;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Citas{");
        sb.append("nombre_cita=").append(nombre_cita);
        sb.append(", fecha_cita=").append(fecha_cita);
        sb.append(", hora_cita=").append(hora_cita);
        sb.append(", direccion_cita=").append(direccion_cita);
        sb.append(", consultorio=").append(consultorio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
