package aedapp;

import personas.Facultativo;
import personas.Estudiante;
import personas.Empleado;
import personas.Cliente;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Joel Couto Lugo
 */
public class AED {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] clientes = new Cliente[3];
        Estudiante[] estudiantes = new Estudiante[3];
        Empleado[] empleados = new Empleado[3];
        Facultativo[] facultativos = new Facultativo[3];
        
        Pattern caracteresEspecialesPatron = Pattern.compile("[\"@#$%&.,*()_+=|<>?{}\\[\\]~-]");
        Matcher specialFinder;  
        Pattern numerosPatron = Pattern.compile("[0-9]");
        
        String nombre;
        int codigo;
        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 CLIENTES");
        
        Boolean nombreCorrecto=false;
        Boolean codigoCorrecto=false;
        
        for (int i = 0; i < clientes.length; i++) {
            
            do{
            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();
            specialFinder = caracteresEspecialesPatron.matcher(nombre);
            nombreCorrecto = specialFinder.find();
            System.out.println(nombreCorrecto);
            }while(nombreCorrecto);
            
            /*System.out.print("Introduce un numero como codigo entre 100 y 300 ambos incluidos: ");
            codigo = sc.nextInt();
            
            clientes[i] = new Cliente(nombre,codigo);
            
            System.out.println(clientes[i].getCodigo()+" y "+ clientes[i].getNombre());
            */
            sc.nextLine();
            System.out.println("------------------------------------");

        }
       
    }
}
