package es.uib.prgava.tema1.ejercicios;

public class DemoDireccionIpv4 {
    // CAMBIO: se añade main para que Java pueda ejecutar estas instrucciones.
    public static void main(String[] args) {
        // CAMBIO: ip se declara dentro de main, donde se permite usar var.
        var ip = new DireccionIpv4(192, 168, 1, 1);
        System.out.println(ip);                                            // 192.168.1.1
        System.out.println(ip.primero());                                  // 192
        System.out.println(ip.equals(new DireccionIpv4(192, 168, 1, 1)));  // true
        System.out.println(ip == new DireccionIpv4(192, 168, 1, 1));       // false

        try {
            new DireccionIpv4(192, 168, 1, 300);
            // CAMBIO: este mensaje solo aparece si no se lanza la excepción esperada.
            System.out.println("ERROR: tenía que haber lanzado");
        } catch (IllegalArgumentException e) {
            // CAMBIO: getMessage() lleva M mayúscula y captura el mensaje de la excepción.
            System.out.println(e.getMessage());
        }
    }
}
