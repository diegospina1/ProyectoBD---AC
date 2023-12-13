package co.edu.ue.entities;


public class LoginUsuario {
    
    private String usuario;
    private String passwordU;

    public LoginUsuario(String usuario, String passwordU) {
        
        this.usuario = usuario;
        this.passwordU = passwordU;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Login{");
        sb.append("usuario=").append(usuario);
        sb.append(", passwordU=").append(passwordU);
        sb.append('}');
        return sb.toString();
    }
    
    
}
