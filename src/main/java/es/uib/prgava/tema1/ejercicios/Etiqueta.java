// Etiqueta.java
package es.uib.prgava.tema1.ejercicios;
import java.util.Objects;
public class Etiqueta {

    private final String texto;
    private final String color;

    public Etiqueta(String texto, String color) {
        this.texto = texto;
        this.color = color;
    }

    public String texto() { return texto; }

    public String color() { return color; }

    @Override
    public boolean equals(Object otro) {
        if(this == otro)return true;
        if (!(otro instanceof Etiqueta esa)) return false;
        return Objects.equals(texto, esa.texto) && color.equals(esa.color);
    }

    @Override
    public int hashCode(){
        return Objects.hash(texto,color);
    }
    @Override
    public String toString() {
        return "Etiqueta[" + texto + ", " + color + "]";
    }
}
