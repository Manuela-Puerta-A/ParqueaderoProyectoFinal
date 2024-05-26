package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Scanner;

public class Vehiculo {
    private static Scanner scanner = new Scanner(System.in);
    public String numeroPlaca;
    public String modelo;
    public Propietario propietario;
    private static LinkedList<Vehiculo> vehiculos = new LinkedList<>();

    // ------------------Constructor--------------------//

    public Vehiculo(String numeroPlaca, String modelo, Propietario propietario) {

        this.numeroPlaca = numeroPlaca;
        this.modelo = modelo;
        this.propietario = propietario;

    }

    // ------------------Getters and Setters--------------------//
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    // ------------------Metodo toString--------------------//
    public String toString() {
        return "Propietario: " + propietario + ", Placa: " + numeroPlaca + ", Modelo: " + modelo;
    }

    // ------------------Metodo para agregar un vehiculo--------------------//
    public static void agregarVehiculo() {
        System.out.println("Seleccione el tipo de vehiculo que desea agregar");
        System.out.println("1-Carro\n2-Motocicleta\n3-Motocicleta eléctrica");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        Propietario propietario = Propietario.crearPropietario();
        System.out.println("Ingrese el numero de placa del Vehiculo;");
        String numeroPlaca = scanner.nextLine();
        System.out.println("Ingrese el modelo del Vehiculo;");
        String modelo = scanner.nextLine();
        System.out.println("ingrese la posicion donde desee guardar su vehiculo i");
        int posicioni = scanner.nextInt();
        System.out.println("ingrese la posicion donde desee guardar su vehiculo j");
        int posicionj = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Vehiculo agregado correctamente\n ");
                vehiculos.add(new Carro(numeroPlaca, modelo, propietario));
                Parqueadero.ocuparPuesto(vehiculos, posicioni, posicionj);
                break;
            case 2:

                System.out.println("Ingrese la velocidad maxima del Vehiculo;");
                String velocidadMaxima = scanner.nextLine();
                System.out.println("Vehiculo agregado correctamente\n ");
                vehiculos.add(new Moto(numeroPlaca, modelo, propietario, velocidadMaxima));
                Parqueadero.ocuparPuesto(vehiculos, posicioni, posicionj);
                break;
            case 3:
                System.out.println("Ingrese la velocidad maxima del Vehiculo;");
                String velocidadMaximaElectrica = scanner.nextLine();
                System.out.println("Vehiculo agregado correctamente\n ");
                vehiculos.add(new MotoHibrida(numeroPlaca, modelo, propietario, velocidadMaximaElectrica));
                // Puesto.ocuparPuesto(vehiculos, posicioni,posicionj);
                break;

            default:
                System.out.println("Esta no es una opción valida\n ");
                break;

        }

    }

    // ------------------Metodo para mostrar Vehiculo--------------------//
    public static void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

    }

    // ------------------Metodo para eliminar un Vehiculo--------------------//
    public static void eliminarVehiculo() {
        scanner.nextLine();
        System.out.print("Ingrese la placa del vehiculo que desea eliminar: ");
        String Placa = scanner.nextLine();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumeroPlaca().equals(Placa)) {
                vehiculos.remove(vehiculo);
                System.out.println("Vehiculo con placa: " + vehiculo.getNumeroPlaca() + " Eliminado exitosamente\n");
            }
        }
    }
}