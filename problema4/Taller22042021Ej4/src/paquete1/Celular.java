package paquete1;

/**
 *
 * @author 0zzda
 */
public class Celular {
    private String sistemaOperativo;
    private String tamañoPantalla;
    private double costo;
    private String direccionMac;
    private String informacionIMEI;
    public void establecerSistemaOperativo(String n) {
        sistemaOperativo = n;
    }

    public void estableceTamañoPantalla(String n) {
        tamañoPantalla = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public void establecerDireccIonMac(String n) {
        direccionMac = n;
    }
    
    public void establecerdorIfmromacionIMEI(String n) {
        informacionIMEI = n;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamañoPantalla() {
        return tamañoPantalla;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccIonMac() {
        return direccionMac;
    }
    
    public String obtenerIfmromacionIMEI() {
        return informacionIMEI;
    }
    
}
