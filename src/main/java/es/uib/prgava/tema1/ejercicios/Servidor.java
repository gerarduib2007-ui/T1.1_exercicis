package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicios 1.1.2 y 1.1.7. Servidor: objeto con identidad y con estado que cambia.
 *
 * <p>Clase tradicional, no un {@code record}, precisamente porque su estado cambia. El modelo
 * es {@code DispositivoRed}. Fíjate en que no hay ni debe haber un método para cambiar el
 * nombre.
 */
public class Servidor {

    // TODO 1.1.2: declara aquí el atributo de clase que cuenta los servidores creados.

    private final String nombre;
    private boolean enMantenimiento;
    private static int totalServidorsCreats;
    /**
     * Un servidor nace fuera de mantenimiento.
     *
     * @throws IllegalArgumentException si el nombre es {@code null} o está en blanco
     */
    public Servidor(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            // TODO 1.1.2: valida el nombre, inicializa el estado e incrementa el contador.
            throw new IllegalArgumentException("El nombre del servidor no puede estar vacío o ser nulo");
        }
        this.nombre = nombre;
        this.enMantenimiento = false;
        totalServidorsCreats++;
    }

    /** Método de clase: cuántos servidores se han construido desde que arrancó el programa. */
    public static int servidoresCreados() {
        // TODO 1.1.2
        return totalServidorsCreats;
    }

    public void entrarEnMantenimiento() {
        // TODO 1.1.2
        enMantenimiento= true;
    }

    public void salirDeMantenimiento() {
        // TODO 1.1.2
        enMantenimiento = false;
    }

    public String nombre() {
        // TODO 1.1.2
        return nombre;
    }

    public boolean estaEnMantenimiento() {
        return enMantenimiento;
    }

    /** Por ejemplo {@code web01 (operativo)} o {@code web01 (en mantenimiento)}. */
    @Override
    public String toString() {
        // TODO 1.1.2
        if (enMantenimiento){
            return nombre + " (en mantenimiento)";
        }else {
            return nombre + " (operativo)";
        }

    }
}
