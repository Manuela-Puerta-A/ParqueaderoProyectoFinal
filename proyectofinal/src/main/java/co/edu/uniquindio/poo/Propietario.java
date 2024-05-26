package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Propietario extends Persona {
    private static Scanner scanner = new Scanner(System.in);

    public Propietario(String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
    }

    public static Propietario crearPropietario() {
        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la direccion del propietario:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el telefono del propietario:");
        String telefono = scanner.nextLine();
        return new Propietario(nombre, direccion, telefono);
    }
}
