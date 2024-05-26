package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Parqueadero {

    private static Scanner scanner = new Scanner(System.in);
    private int maxI, maxJ;
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
    public static void tamanoParqueadero() {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas del parqueadero:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas del parqueadero:"));
        String[][] puestos = new String[filas][columnas];
        System.out.println("Parqueadero creado:");
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[0].length; j++) {
                if (i == j) {
                    puestos[i][j] = "x";
                } else {
                    puestos[i][j] = "[L]";
                }
                System.out.print(puestos[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void  ocuparPuesto(Vehiculo vehiculo,  int i, int j) {
        if (i >= 0 && i < maxI && j >= 0 && j < maxJ) {
            puestos[i][j].ocuparPuesto(vehiculo);
        } else {
            System.out.println("Posición inválida.");
        }
    }
    public  void estadoactualparqueadero(){
        for(int i=0;i<maxI;i++){
            for(int j=0; j<maxJ; j++){
                Puesto puesto= puestos[i][j];
                if(puesto.ocupado()){
                    Vehiculo vehiculo=puesto.getVehiculo();
                if(vehiculo instanceof Carro){
                    System.out.println("Carro");
                }
                else if( vehiculo instanceof Moto){
                    System.out.println("Moto");

                }else if( vehiculo instanceof MotoHibrida){
                    System.out.println("hibrida");
                }
                }else{
                    System.out.println("L");
                }

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

    public static void ocuparPuesto(LinkedList<Vehiculo> vehiculos, int posicioni, int posicionj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ocuparPuesto'");
    }
}

    

