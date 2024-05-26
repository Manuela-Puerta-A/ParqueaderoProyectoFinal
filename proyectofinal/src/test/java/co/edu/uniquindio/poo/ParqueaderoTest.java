package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    /*
     * Test para validar que no se cree un parqueadero con nombre null
     */
    @Test
    public void nombreNull() {
        LOG.info("Inicio test");
        Parqueadero parqueadero = new Parqueadero("Los inges", 5, 5);
        assertThrows(Throwable.class, () -> new Parqueadero(null, 0, 0));
        LOG.info("Fin test");
    }

    /*
     * Test para validar que no se cree un parqueadero con filas y columnas nulas
     */
    @Test
    public void columnasyfilasnegativas() {
        LOG.info("Inicio test");
        Parqueadero parqueadero = new Parqueadero("Los inges", 5, 5);
        assertThrows(Throwable.class, () -> new Parqueadero(null, -5, -5));
        LOG.info("Fin test");

    }

}
