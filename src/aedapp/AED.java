package aedapp;

import personas.Facultativo;
import personas.Estudiante;
import personas.Empleado;
import personas.Cliente;
import java.util.Scanner;

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

        String nombre;
        int codigo;
        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 CLIENTES");

        for (int i = 0; i < clientes.length; i++) {

            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();
            
            System.out.print("Introduce un numero como codigo entre 100 y 300 ambos incluidos: ");
            codigo = sc.nextInt();
            
            clientes[i] = new Cliente(nombre,codigo);
            
            System.out.println(clientes[i].getCodigo()+" y "+ clientes[i].getNombre());
            
            sc.nextLine();
            System.out.println("------------------------------------");

        }
    }
}
