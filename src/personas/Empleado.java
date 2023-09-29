package personas;

import extras.Contrato;

public class Empleado extends Cliente{
    
    private Contrato contrato;
    
    public Empleado(String nombre){
        super(nombre);
    }

    public Empleado(String nombre, Contrato contrato) {
        super(nombre);
        this.contrato=contrato;
    }
  
}
