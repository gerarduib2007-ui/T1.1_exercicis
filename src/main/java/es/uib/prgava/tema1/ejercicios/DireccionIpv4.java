package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicios 1.1.1, 1.1.7 y 1.1.8. Dirección IPv4 como cuatro octetos.
 *
 * <p>Objeto-valor: sin identidad propia e inmutable. Por eso es un {@code record} y por eso no
 * tienes que escribir {@code equals} ni {@code hashCode}.
 */
public record DireccionIpv4(int primero, int segundo, int tercero, int cuarto) {

    public DireccionIpv4 {
        // TODO 1.1.1: cada octeto va de 0 a 255. Si alguno se sale, lanza
        // IllegalArgumentException con el mensaje "Octeto fuera de rango: " + valor.
        // Son cuatro comprobaciones iguales: decide si las escribes cuatro veces o
        // extraes un método de clase privado.
    }

    /** Forma habitual de una dirección, por ejemplo {@code 192.168.1.1}. */
    @Override
    public String toString() {
        // TODO 1.1.1: concatena los cuatro componentes separados por puntos.
        throw new UnsupportedOperationException("TODO 1.1.1: DireccionIpv4.toString");
    }
}
