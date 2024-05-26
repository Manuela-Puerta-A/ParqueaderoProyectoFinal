package co.edu.uniquindio.poo;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/*
*@Manuela Puerta
*@Juan Carmona
 * Se usa la clase App para ser la que ejecute todo el codigo.
 */

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // -------------------------Crear Parqueadero--------------------------------//
        String nombreParqueadero = Parqueadero.crearParqueadero();
        Parqueadero.tamañoParqueadero();

        // -----------------While y Switch para la logica del "Menu"------------------//
        int opcion = 0;
        while (opcion != 4) {
            System.out.println(
                    "Bienvenido al parqueadero " + nombreParqueadero + "\nPor favor seleccione la opción que deseé");
            System.out.println("1-Ingresar un nuevo vehiculo");
            System.out.println("2-Mostrar todos los vehiculos del parqueadero");
            System.out.println("3-Eliminar un vehiculo");
            System.out.println("4-Cerrar parqueadero");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    Vehiculo.agregarVehiculo();

                    break;

                case 2:
                    Vehiculo.mostrarVehiculos();
                    break;
                case 3:
                    Vehiculo.eliminarVehiculo();
                    break;

                default:
                    System.out.println("¡Hasta luego!");

                    break;
            }

        }
        scanner.close();

    }
}