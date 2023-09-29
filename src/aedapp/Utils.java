package aedapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import personas.Cliente;
import personas.Empleado;
import personas.Estudiante;
import personas.Facultativo;

public class Utils {

    Pattern caracteresEspecialesPatron = Pattern.compile("[\"@#$%&.,*()_+=|<>?{}\\[\\]~-]");
    Matcher specialFinder;
    Pattern numerosPatron = Pattern.compile("[0-9]");

    public Boolean hasSpecialChar(String nombre) {
        Boolean nombreIncorrecto;

        specialFinder = caracteresEspecialesPatron.matcher(nombre);
        nombreIncorrecto = specialFinder.find();

        return nombreIncorrecto;
    }

    public Boolean hasNumber(String nombre) {
        Boolean nombreIncorrecto;

        specialFinder = numerosPatron.matcher(nombre);
        nombreIncorrecto = specialFinder.find();

        return nombreIncorrecto;
    }

    public Boolean isInRange(int codigo) {

        return codigo <= 300 && codigo >= 100;
    }

    public void createClientes(Cliente[] clientes, Scanner sc) {

        String nombre;
        int codigo;

        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 CLIENTES");
        for (int i = 0; i < clientes.length; i++) {

            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();

            while (hasSpecialChar(nombre) || hasNumber(nombre)) {
                System.out.println("EL NOMBRE NO PUEDE TENER CARACTERES ESPECIALES.......");
                System.out.print("Introduce el nombre: ");
                nombre = sc.nextLine();
            }

            System.out.print("Introduce un numero como codigo entre 100 y 300 ambos incluidos: ");
            codigo = sc.nextInt();

            while (!isInRange(codigo)) {
                System.out.println("RECUERDA EL NUMERO TIENE QUE ESTAR ENTRE 100 Y 300.....");
                System.out.print("Introduce un numero como codigo entre 100 y 300 ambos incluidos: ");
                codigo = sc.nextInt();
            }

            clientes[i] = new Cliente(nombre, codigo);

            //System.out.println(clientes[i].getCodigo() + " y " + clientes[i].getNombre());
            sc.nextLine();
            System.out.println("------------------------------------");
        }

    }

    public void createEstudiantes(Estudiante[] estudiantes, Scanner sc) {

        String nombre;

        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 ESTUDIANTES");
        for (int i = 0; i < estudiantes.length; i++) {

            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();

            while (hasSpecialChar(nombre) || hasNumber(nombre)) {
                System.out.println("EL NOMBRE NO PUEDE TENER CARACTERES ESPECIALES.......");
                System.out.print("Introduce el nombre: ");
                nombre = sc.nextLine();
            }

            estudiantes[i] = new Estudiante(nombre);
            System.out.println("------------------------------------");
        }

    }

    public void createEmpleado(Empleado[] empleados, Scanner sc) {

        String nombre;

        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 EMPLEADOS");
        for (int i = 0; i < empleados.length; i++) {

            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();

            while (hasSpecialChar(nombre) || hasNumber(nombre)) {
                System.out.println("EL NOMBRE NO PUEDE TENER CARACTERES ESPECIALES.......");
                System.out.print("Introduce el nombre: ");
                nombre = sc.nextLine();
            }

            empleados[i] = new Empleado(nombre);
            System.out.println("------------------------------------");
        }

    }

    public void createFacultativo(Facultativo[] facultativos, Scanner sc) {

        String nombre;

        System.out.println("AHORA VAS A INTRODUCIR EL NOMBRE DE 3 FACULTATIVOS");
        for (int i = 0; i < facultativos.length; i++) {

            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();

            while (hasSpecialChar(nombre) || hasNumber(nombre)) {
                System.out.println("EL NOMBRE NO PUEDE TENER CARACTERES ESPECIALES.......");
                System.out.print("Introduce el nombre: ");
                nombre = sc.nextLine();
            }

            facultativos[i] = new Facultativo(nombre);
            System.out.println("------------------------------------");
        }

    }

    public void imprimirDatos(Cliente[] clientes, Estudiante[] estudiantes, Empleado[] empleados, Facultativo[] facultativos) {

        System.out.println("\n........ACCESO A DATOS........\n");

        for (Cliente cliente : clientes) {
            System.out.println("[i]  Cliente: " + cliente.getNombre() + ", Codigo seguro ---[" + cliente.getCodigo() + "]");
        }

        for (Estudiante estudiante : estudiantes) {
            System.out.println("[i]  Estudiante: " + estudiante.getNombre());
        }

        for (Empleado empleado : empleados) {
            System.out.println("[i]  Empleado: " + empleado.getNombre());
        }

        for (int i = 0; i < facultativos.length; i++) {

            System.out.println("[i]  Facultativo: " + facultativos[i].getNombre());

        }

    }
}
