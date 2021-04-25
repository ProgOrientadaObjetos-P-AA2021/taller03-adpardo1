package paquete2;
import paquete1.Celular;

public class Ejecutor {
    public static void main(String[] args) {
        Celular t1 = new Celular();
        t1.establecerSistemaOperativo("android");
        t1.estableceTamañoPantalla("15x17");
        t1.establecerCosto(500);
        t1.establecerDireccIonMac("ss55");
        t1.establecerdorIfmromacionIMEI("saw58485");
            System.out.printf("El celular de sistema operativo %s con un tamaño de pantalla de %s de direccion Mac %s"
                    + " e informacion IMEI %s, tiene un costo de: %s dolares\n", t1.obtenerSistemaOperativo(), t1.obtenerTamañoPantalla()
            , t1.obtenerDireccIonMac(), t1.obtenerIfmromacionIMEI(), t1.obtenerCosto());
    }
    
}
