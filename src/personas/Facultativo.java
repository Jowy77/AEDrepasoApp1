package personas;

import extras.Contrato;

public class Facultativo extends Empleado {

    public final int TECNICO = 1;
    public final int LICENCIADO = 2;
    protected String HORARIO;
    protected int ESPECIALIDAD;
    
    public Facultativo(String nombre){
        super(nombre);
    }

    public Facultativo(String nombre, Contrato contrato) {
        super(nombre, contrato);
    }
 }
