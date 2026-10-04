package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.DispositivoRed;

/**
 * Ejercicio 1.1.4. Punto de acceso inalámbrico: <em>es un</em> dispositivo de red.
 *
 * <p>El modelo son {@code Enrutador} y {@code Conmutador}, en el paquete {@code poo}.
 */
public class PuntoAcceso extends DispositivoRed {

    private final String ssid;
    private int canal;

    /**
     * @param canal de 1 a 13
     * @throws IllegalArgumentException si el canal no está en ese rango
     */
    private void validarCanal(int canal){
        if (canal <1 || canal >13)
            throw new IllegalArgumentException("El canal debe estar entre 1 y 13");
    }

    public PuntoAcceso(String nombre, String direccionIp, String ssid, int canal) {
        super(nombre, direccionIp);
        validarCanal(canal);
        this.ssid = ssid;
        this.canal = canal;
        // TODO 1.1.4: valida el canal y asigna lo propio. La llamada a super(...) ya está
        // escrita y tiene que ser la primera instrucción del constructor.

    }

    public String getSsid() {
        // TODO 1.1.4
        return ssid;
    }

    public int getCanal() {
        // TODO 1.1.4
        return canal;
    }

    /** Misma validación que el constructor. Piensa si te compensa escribirla dos veces. */
    public void cambiarCanal(int nuevo) {
        // TODO 1.1.4
        validarCanal(nuevo);
        canal = nuevo;
        }

    /** Lo heredado y lo propio. Dentro puedes llamar a super.toString(). */
    @Override
    public String toString() {
        return "PuntoAcceso[" + super.toString() + ", ssid=" + ssid + ", canal=" + canal + "]";
    }

    // TODO 1.1.4: crea un Enrutador y un PuntoAcceso, mira qué devuelve
    // DispositivoRed.getDispositivosCreados() y explica aquí por qué cuenta los dos.
}
