package paquete2;

import paquete1.InstitucionEducativa;

public class Principal {

    public static void main(String[] args) {
        InstitucionEducativa edu1 = new InstitucionEducativa();

        edu1.establecerNombre("Eloy Alfaro");
        edu1.establecerTInstitucion("Colegio");
        edu1.establecerNumeroAlumnos(2500);
        edu1.establecerNumeroDocentes(175);
        edu1.establecerNumeroSedes(10);

        System.out.printf("La institucion: %s %s, cuenta con un total de: %d estudiantes y %d docentes ademas cuenta con %d sedes\n",
                edu1.obtenerTInstitucion(),
                edu1.obtenerNombre(),
                edu1.obtenerNumeroAlumnos(),
                edu1.obtenerNumeroDocentes(), edu1.obtenerNumeroSedes());
    }
}
