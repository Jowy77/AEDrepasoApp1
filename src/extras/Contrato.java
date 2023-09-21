package extras;

import java.util.Calendar;


public class Contrato {
    
    private String turno;
    private double salario;
    private final Calendar fechaContrato;
    
    public Contrato(String turno, double salario, Calendar fechaContrato){
        this.turno=turno;
        this.salario=salario;
        this.fechaContrato=fechaContrato;
    }
    
    //getters
    
    public String getTurno(){
        return this.turno;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public Calendar getFechaContrato(){
        return this.fechaContrato;
    }
    
    //setters
    
    public void setTurno(String turno){
        this.turno=turno;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
    
    @Override
    public String toString(){
        return "Este empleado tiene turno de: "+turno+" Este es su salario "+
                " y esta es la fecha de contratacion";
    }
}
