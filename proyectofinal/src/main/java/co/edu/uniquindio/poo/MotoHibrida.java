package co.edu.uniquindio.poo;

public class MotoHibrida extends Vehiculo {
    private String velocidadMaximaHibrida;
    //------------------Constructor--------------------//
    public MotoHibrida(String numeroPlaca, String modelo, Propietario propietario, String velocidadMaximaHibrida) {
        super(numeroPlaca, modelo, propietario);
        this.velocidadMaximaHibrida = velocidadMaximaHibrida;

    }
    //------------------Get and Set atributo VelocidadMaximaHibrida--------------------//
    public String getVelocidadMaximaElectrica() {
        return velocidadMaximaHibrida;
    }

    public void setVelocidadMaximaHibrida(String velocidadMaximaHibrida) {
        this.velocidadMaximaHibrida = velocidadMaximaHibrida;
    }

    
}
