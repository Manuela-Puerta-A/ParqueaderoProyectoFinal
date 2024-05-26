package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Propietario extends Persona {
    private static Scanner scanner = new Scanner(System.in);
    //------------------Constructor--------------------//
    public Propietario(String nombre, String apellido, String documento) {

        super(nombre, apellido, documento);
        assert nombre != null && !nombre.isBlank();
        assert apellido != null && !apellido.isBlank();
        assert documento != null && !documento.isBlank();

    }
    //Metodo toString 
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", Documento: " + documento;
    }
    //Metodo para crear un propietario
    public static Propietario crearPropietario() {
        System.out.println("Ingrese el nombre del propietario del vehiculo:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del propietario del vehiculo:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el documento del propietario del vehiculo:");
        String documento = scanner.nextLine();
        return new Propietario(nombre, apellido, documento);

    }

}