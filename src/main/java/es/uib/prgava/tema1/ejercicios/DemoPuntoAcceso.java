package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.DispositivoRed;
import es.uib.prgava.tema1.poo.Enrutador;

public final class DemoPuntoAcceso {
    public static void main(String[] args) {
        System.out.println("Dispositivos antes: " + DispositivoRed.getDispositivosCreados());

        var enrutador = new Enrutador("Router principal", "192.168.1.1", 4);
        var puntoAcceso = new PuntoAcceso("Punto acceso salón", "192.168.1.2", "CasaWifi", 6);

        System.out.println(enrutador);
        System.out.println(puntoAcceso);
        System.out.println("Dispositivos después: " + DispositivoRed.getDispositivosCreados());
    }
}
