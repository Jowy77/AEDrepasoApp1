package aedapp;

import personas.Facultativo;
import personas.Estudiante;
import personas.Empleado;
import personas.Cliente;
import java.util.Scanner;

public class AED {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils utiles = new Utils();

        Cliente[] clientes = new Cliente[3];
        Estudiante[] estudiantes = new Estudiante[3];
        Empleado[] empleados = new Empleado[3];
        Facultativo[] facultativos = new Facultativo[3];

        utiles.createClientes(clientes, sc);
        utiles.createEstudiantes(estudiantes, sc);
        utiles.createEmpleado(empleados, sc);
        utiles.createFacultativo(facultativos, sc);

        utiles.imprimirDatos(clientes, estudiantes, empleados, facultativos);
        sc.close();
    }
}
