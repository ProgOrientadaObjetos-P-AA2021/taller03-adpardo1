package paquete1;

public class equivalenteHoras {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerHoras(int n) {
        horas = n;
    }

    public void establecerMinutos() {
        minutos = horas*60;
    }

    public void establecerSegundos() {
        segundos = minutos*60;
    }

    public void establecerDias() {
        dias = horas/24;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenersegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }

}
