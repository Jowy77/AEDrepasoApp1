package personas;
import java.security.SecureRandom;

public class Cliente {
    protected String nombre;
    protected int codigo;//ESTE ES UN RANDOM
    protected String direccion;
    protected String numeroMovil;
    protected String email;
    
    
   public Cliente(String nombre){
       this.nombre=nombre;
   }
   
   public Cliente(String nombre, int codigoTecladoUsuario){
       this.nombre=nombre;
       this.codigo = new SecureRandom().nextInt(10000000,999999699)+codigoTecladoUsuario;
   }
   
   @Override
   public String toString(){
       return "El nombre es: "+nombre+" y su codigo es: "+codigo;
   }
   
   public String getNombre(){
       return this.nombre;
   }
   
   public int getCodigo(){
       return this.codigo;
   }
   
}
