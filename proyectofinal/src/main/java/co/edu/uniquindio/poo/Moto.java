package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private String velocidadMaxima;
    //------------------Constructor--------------------//
    public Moto(String numeroPlaca, String modelo, Propietario propietario, String velocidadMaxima) {
        super(numeroPlaca, modelo, propietario);

        this.velocidadMaxima = velocidadMaxima;
    }
//------------------Get and Set atributo VelocidadMaxima--------------------//
    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

}