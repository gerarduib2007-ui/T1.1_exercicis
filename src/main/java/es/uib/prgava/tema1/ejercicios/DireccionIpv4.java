package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicios 1.1.1, 1.1.7 y 1.1.8. Dirección IPv4 como cuatro octetos.
 *
 * <p>Objeto-valor: sin identidad propia e inmutable. Por eso es un {@code record} y por eso no
 * tienes que escribir {@code equals} ni {@code hashCode}.
 */
public record DireccionIpv4 (int primero, int segundo, int tercero, int cuarto) implements Identificable, Comparable<DireccionIpv4>{

    public DireccionIpv4{
        // TODO 1.1.1: cada octeto va de 0 a 255. Si alguno se sale, lanza
        // IllegalArgumentException con el mensaje "Octeto fuera de rango: " + valor.
        // Son cuatro comprobaciones iguales: decide si las escribes cuatro veces o
        // extraes un método de clase privado.
        validarOcteto(primero);
        validarOcteto(segundo);
        validarOcteto(tercero);
        validarOcteto(cuarto);
    }
    @Override
    public String identificador(){
        return toString();
    }
    private static void validarOcteto(int octeto) {
        if (octeto < 0 || octeto > 255) {
            throw new IllegalArgumentException("Octeto fuera de rango: " + octeto);
        }
    }

    @Override
    public int compareTo(DireccionIpv4 otra) {
        int resultado = Integer.compare(primero, otra.primero);
        if (resultado !=0) return resultado;
        resultado = Integer.compare(segundo, otra.segundo);
        if (resultado !=0) return resultado;
        resultado = Integer.compare(tercero, otra.tercero);
        if (resultado !=0) return resultado;
        return Integer.compare(cuarto, otra.cuarto);
    }

    /** Forma habitual de una dirección, por ejemplo {@code 192.168.1.1}. */
    @Override
    public String toString() {
        return primero + "." + segundo + "." + tercero + "." + cuarto;
    }

}
