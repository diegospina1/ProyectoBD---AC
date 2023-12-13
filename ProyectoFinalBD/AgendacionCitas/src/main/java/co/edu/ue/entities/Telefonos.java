
package co.edu.ue.entities;


public class Telefonos {
    
    private String numero;
    private int categoria;
    
    public Telefonos(String numero, int categoria) {
        this.numero = numero;
        this.categoria = categoria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Telefonos{");
        sb.append("numero=").append(numero);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
