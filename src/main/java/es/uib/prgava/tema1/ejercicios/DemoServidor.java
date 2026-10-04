package es.uib.prgava.tema1.ejercicios;

public class DemoServidor{
public static void main(String[] args){
var web = new Servidor("web01");
var correo = new Servidor("mail01");
System.out.println(web);                           // web01 (operativo)
web.entrarEnMantenimiento();
System.out.println(web);                           // web01 (en mantenimiento)
System.out.println(Servidor.servidoresCreados());  // 2{
}
}