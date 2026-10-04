package es.uib.prgava.tema1.ejercicios;

/** Ejercicio 1.1.6. La lectura se pasa por el constructor: una prueba no puede afirmar nada
 * sobre un valor aleatorio. */
public final class SensorTemperatura extends Sensor {

    private final double grados;

    public SensorTemperatura(String ubicacion, double grados) {
        super(ubicacion);
        this.grados = grados;
    }

    @Override
    public double leer() {
        // TODO 1.1.6
        return grados;
    }

    @Override
    protected String magnitud() {
        // TODO 1.1.6: "temperatura"
        return "temperatura";
    }

    // TODO 1.1.6: escribe aquí, comentada, la línea new Sensor("sala-3") y anota qué dice
    // new Sensor("sala-3") no se puede pq la clase es abstracta
}
