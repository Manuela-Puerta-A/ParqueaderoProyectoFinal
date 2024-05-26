package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Parqueadero {

    private static Scanner scanner = new Scanner(System.in);
    String nombreParqueadero;
    int filas;
    int columnas;
    Puesto[][] puestos;
    Map<String, Vehiculo> registroVehiculos;
    Map<String, Double> tarifas;

    // ------------------Constructor--------------------//
    public Parqueadero(String nombreaParqueadero, int filas, int columnas) {
        this.nombreParqueadero = nombreaParqueadero;
        this.filas = filas;
        this.columnas = columnas;
        this.puestos = new Puesto[filas][columnas];
        this.registroVehiculos = new HashMap<>();
        this.tarifas = new HashMap<>();

    }

    // -Metodo para crear un parqueadero con nombre-//
    public static String crearParqueadero() {
        String nombreParqueadero = JOptionPane.showInputDialog("Ingrese el nombre del Parqueadero:");

        JOptionPane.showMessageDialog(null, "Parqueadero creado: " + nombreParqueadero);
        return nombreParqueadero;
    }

    // ----------------Metodo para crear el tamaño del parqueadero--------------//
    public static void tamañoParqueadero() {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas del parqueadero:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas del parqueadero:"));
        String[][] puestos = new String[filas][columnas];
        System.out.println("Parqueadero creado:");
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[0].length; j++) {
                if (i == j) {
                    puestos[i][j] = "x";
                } else {
                    puestos[i][j] = "-";
                }
                System.out.print(puestos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

}