package co.edu.ue.entities;


public class Citas {
    
    String nombre_cita;
    String fecha_cita;
    String hora_cita;
    String direccion_cita;
    String consultorio;
    int documento_med;
    int documento_pac;

    public Citas(String nombre_cita, String fecha_cita, String hora_cita, String direccion_cita, String consultorio, int documento_med, int documento_pac) {
        this.nombre_cita = nombre_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.direccion_cita = direccion_cita;
        this.consultorio = consultorio;
        this.documento_med = documento_med;
        this.documento_pac = documento_pac;
    }

    public String getNombre_cita() {
        return nombre_cita;
    }

    public void setNombre_cita(String nombre_cita) {
        this.nombre_cita = nombre_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
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

    public int getDocumento_med() {
        return documento_med;
    }

    public void setDocumento_med(int documento_med) {
        this.documento_med = documento_med;
    }

    public int getDocumento_pac() {
        return documento_pac;
    }

    public void setDocumento_pac(int documento_pac) {
        this.documento_pac = documento_pac;
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
        sb.append(", documento_med=").append(documento_med);
        sb.append(", documento_pac=").append(documento_pac);
        sb.append('}');
        return sb.toString();
    }
    
    

    
    
}
