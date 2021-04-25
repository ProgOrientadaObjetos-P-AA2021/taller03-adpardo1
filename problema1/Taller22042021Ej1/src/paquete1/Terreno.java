package paquete1;

public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double n) {
        ancho = n;
    }

    public void establecerLargo(double n) {
        largo = n;
    }

    public void establecervalorMetroCuadrado(double n) {
        valorMetroCuadrado = n;
    }

    public void establecerArea() {
        area = ancho * largo;
    }

    public void establecerCosto() {
        costo = valorMetroCuadrado * area;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenervalorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCosto() {
        return costo;
    }
}
