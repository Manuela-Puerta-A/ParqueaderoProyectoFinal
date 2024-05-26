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
        Parqueadero.tamanoParqueadero();
        Parqueadero parqueadero = new Parqueadero(nombreParqueadero, 0, 0);

        // -----------------While y Switch para la logica del "Menu"------------------//
        int opcion = 0;
        while (opcion != 8) {
            System.out.println(
                    "Bienvenido al parqueadero " + nombreParqueadero + "\nPor favor seleccione la opción que deseé");
            System.out.println("1-Si es administrador ingrese");
            System.out.println("2-Ingresar un nuevo vehiculo");
            System.out.println("3-Mostrar todos los vehiculos del parqueadero");
            System.out.println("4-Mostrar estado actual del parqueadero");
            System.out.println("5-Eliminar un vehiculo");
            System.out.println("6-Consultar total a pagar por vehiculo");
            System.out.println("7-Generar reporte ganancias");
            System.out.println("8-Cerrar parqueadero");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    Vehiculo.agregarVehiculo();
                    break;
                case 3:
                    Vehiculo.mostrarVehiculos();
                    break;
                case 4:
                    parqueadero.estadoactualparqueadero();
                    break;
                case 5:
                    Vehiculo.eliminarVehiculo();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        }
        scanner.close();
    }
}
