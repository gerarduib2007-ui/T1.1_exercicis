// Prueba del ejercicio 1.1.7.
//
// Está comentada porque hasta que resuelvas ese ejercicio el código de abajo
// no compila, y un fichero de prueba que no compila impide ejecutar TODAS las
// demás pruebas del proyecto.
//
// Cuando llegues al ejercicio: selecciona el resto del fichero y descoméntalo.
// Ctrl+A y luego Ctrl+K Ctrl+U en VS Code; Ctrl+A y luego Ctrl+/ en IntelliJ.

package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Ejercicio 1.1.7. */
class IdentificableTest {

    @Test
    void unServidorSeIdentificaPorSuNombre() {
        assertEquals("web01", new Servidor("web01").identificador());
    }

    @Test
    void unaDireccionSeIdentificaPorSuFormaConPuntos() {
        assertEquals("10.0.0.1", new DireccionIpv4(10, 0, 0, 1).identificador());
    }

    @Test
    void laEtiquetaFuncionaEnLasDosSinQueNingunaLaEscriba() {
        Identificable servidor = new Servidor("web01");
        Identificable direccion = new DireccionIpv4(10, 0, 0, 1);
        assertEquals("[web01]", servidor.etiqueta());
        assertEquals("[10.0.0.1]", direccion.etiqueta());
    }
}
//
