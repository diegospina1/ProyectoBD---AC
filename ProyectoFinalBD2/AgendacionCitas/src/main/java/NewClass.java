
import co.edu.ue.model.Encriptacion;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danna
 */
public class NewClass {
    
    public static void main(String[] args) {
        
        Encriptacion enc = new Encriptacion();
        
        String secretKey = "Capuchino";
        String cadenaAEnc = "hola";
        String cadenaEnc = enc.ecnode(secretKey, cadenaAEnc);
        String cadenaDes = enc.deecnode(secretKey, cadenaEnc);
        
        JOptionPane.showMessageDialog(null, "Cadena encriptada: " + cadenaEnc);
        JOptionPane.showMessageDialog(null, "Cadena desencriptada: "+ cadenaDes);
        
    }
}
