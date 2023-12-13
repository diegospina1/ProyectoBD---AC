
package co.edu.ue.model;

import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class Encriptacion {
    
    public Encriptacion(){
        
    }
    
    public String ecnode(String secret_key, String cadena){
        
        String encriptacion = "";
        
        try {
            
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secret_key.getBytes("utf-8"));
            byte[] bytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(bytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.DECRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
            
        } catch (Exception e) {
            System.out.println("" + e.toString());
        }
        
        return encriptacion;
    }
    
    public String deecnode(String secret_key, String cadenaEncriptada){
        
        String desencriptacion = "";
        
        try {
            
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secret_key.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plaintText = decipher.doFinal(message);
            desencriptacion = new String(plaintText, "UTF-8");
            
        } catch (Exception e) {
            
            System.out.println("" + e.toString());
        }
        
        return desencriptacion;
    }
}
