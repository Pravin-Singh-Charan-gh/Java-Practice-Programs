package interfaces;
import java.util.Base64;

interface Encryptable{
    public String encrypt(String data);
    public String decrypt(String encryptedData);
}
class AES implements Encryptable{
    @Override
    public String encrypt(String data) {
        
    }

    @Override
    public String decrypt(String encryptedData) {
        
    }
}
class RSA implements Encryptable{
    @Override
    public String encrypt(String data) {
        
    }

    @Override
    public String decrypt(String encryptedData) {
        
    }
}
public class Main10 {
    public static void main(String[] args) {
         AES a1=new AES();
         System.out.println(a1.encrypt("hbabdadbad daisdoashd"));
         System.out.println(a1.decrypt("hbabuhwuiqdadbad daisdoashd"));

         RSA r1=new RSA();
         System.out.println(r1.decrypt("hbabdadbad daisdoashd"));
         System.out.println(r1.decrypt("hbabuhwuiqdadbad daisdoashd"));
    }    
}

// 10. Write a Java program to create an interface Encryptable with methods
//  encrypt (String data) and decrypt (String encryptedData) that define 
//  encryption and decryption operations. Create two classes AES and RSA 
//  that implement the Encryptable interface and provide their own encryption 
//  and decryption algorithms.