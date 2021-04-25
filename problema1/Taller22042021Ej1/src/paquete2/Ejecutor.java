package paquete2;

import paquete1.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno t1 = new Terreno();
        t1.establecerAncho(50.5);
        t1.establecerLargo(20.4);
        t1.establecervalorMetroCuadrado(5.3);
        t1.establecerArea();
        t1.establecerCosto();
        System.out.printf("El costo del terreno es: %s\nCon sus %s metros cuadrados y un valor por metro de %s\n"
                , t1.obtenerCosto(), t1.obtenerArea(), t1.obtenervalorMetroCuadrado());
    }
}
