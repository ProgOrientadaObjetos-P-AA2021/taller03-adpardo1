package paquete2;
import paquete1.equivalenteHoras;

public class Ejecutor {
    public static void main(String[] args) {
        equivalenteHoras h1 = new equivalenteHoras();
        h1.establecerHoras(500);
        h1.establecerMinutos();
        h1.establecerSegundos();
        h1.establecerDias();
        System.out.printf("El valor en horas es: %s \nEl valor en minutos es %s \nEl valor en segundos es %s \nEl valor en dias es: %s\n",h1.obtenerHoras(), h1.obtenerMinutos(), h1.obtenersegundos(), h1.obtenerDias());
    }
    
}
