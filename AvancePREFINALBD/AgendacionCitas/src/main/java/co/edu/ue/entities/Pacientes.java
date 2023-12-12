
package co.edu.ue.entities;

import java.sql.Date;


public class Pacientes {
    
    private int documento_pac;
    private String nombre_pac;
    private String apellido_paterno;
    private String apellido_materno;
    private String direccion_res;
    private Date fecha_adq_plan;

    public Pacientes(int documento_pac, String nombre_pac, String apellido_paterno, String apellido_materno, String direccion_res, Date fecha_adq_plan) {
        this.documento_pac = documento_pac;
        this.nombre_pac = nombre_pac;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.direccion_res = direccion_res;
        
        this.fecha_adq_plan = fecha_adq_plan;
    }

    public int getDocumento_pac() {
        return documento_pac;
    }

    public void setDocumento_pac(int documento_pac) {
        this.documento_pac = documento_pac;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getDireccion_res() {
        return direccion_res;
    }

    public void setDireccion_res(String direccion_res) {
        this.direccion_res = direccion_res;
    }

    public Date getFecha_adq_plan() {
        return fecha_adq_plan;
    }

    public void setFecha_adq_plan(Date fecha_adq_plan) {
        this.fecha_adq_plan = fecha_adq_plan;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacientes{");
        sb.append("documento_pac=").append(documento_pac);
        sb.append(", nombre_pac=").append(nombre_pac);
        sb.append(", apellido_paterno=").append(apellido_paterno);
        sb.append(", apellido_materno=").append(apellido_materno);
        sb.append(", direccion_res=").append(direccion_res);
        sb.append(", fecha_adq_plan=").append(fecha_adq_plan);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
