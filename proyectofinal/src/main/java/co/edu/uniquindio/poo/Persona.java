package co.edu.uniquindio.poo;

public class Persona {
    // Atributos
    public String nombre;
    public String apellido;
    public String documento;

    // ------------------Constructor--------------------//
    public Persona(String nombre, String apellido, String documento) {
        assert nombre != null && !nombre.isBlank();
        assert apellido != null && !apellido.isBlank();
        assert documento != null && !documento.isBlank();
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    // ----------------------------------Getters-and-setters--------------------------//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}