
package co.edu.ue.entities;

public class Doctores {
    
    private int documento_med; 
    private String nombre_med;
    private String apellido_paterno;
    private String apellido_materno;

    public Doctores(int documento_med, String nombre_med, String apellido_paterno, String apellido_materno) {
        this.documento_med = documento_med;
        this.nombre_med = nombre_med;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
    }

    public int getDocumento_med() {
        return documento_med;
    }

    public void setDocumento_med(int documento_med) {
        this.documento_med = documento_med;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Doctores{");
        sb.append("documento_med=").append(documento_med);
        sb.append(", nombre_med=").append(nombre_med);
        sb.append(", apellido_paterno=").append(apellido_paterno);
        sb.append(", apellido_materno=").append(apellido_materno);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
