
package co.edu.ue.entities;


public class Telefonos {
    
    private String numero;
    
    public Telefonos(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Telefonos{");
        sb.append("numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }
    
}
