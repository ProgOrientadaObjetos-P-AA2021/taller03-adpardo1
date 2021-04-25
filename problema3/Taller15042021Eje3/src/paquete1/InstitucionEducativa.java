package paquete1;

public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTInstitucion(String n) {
        tipoInstitucion = n;
    }

    public void establecerNumeroAlumnos(int n) {
        numeroAlumnos = n;
    }

    public void establecerNumeroDocentes(int n) {
        numeroDocentes = n;
    }

    public void establecerNumeroSedes(int n) {
        numeroSedes = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public void establecerNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
