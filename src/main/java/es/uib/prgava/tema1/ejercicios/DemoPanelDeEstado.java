package es.uib.prgava.tema1.ejercicios;

public class DemoPanelDeEstado{
        public static void main (String []  args){
        var panel = new PanelDeEstado();
panel.registrarVarios("enlace caído", "enlace restaurado", "latencia alta");
System.out.println(panel.resumen());     // 3 eventos registrados{
}
        }