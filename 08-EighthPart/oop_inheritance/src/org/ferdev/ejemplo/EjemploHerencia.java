package org.ferdev.ejemplo;

import org.ferdev.inheritance.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("--------------------- Creando la instancia de la clase Alumno ----------------------------");
        Alumno alumno = new Alumno();
        alumno.setNombre("Fernando");
        alumno.setApellido("Avila");
        alumno.setUniversidad("UTN - FRC");
        alumno.setNotasAlgebra(8.5);
        alumno.setNotasAnalisis(7.5);
        alumno.setNotasIngles(10.0);

        /*
        Si el atributo nombre fuese protected y no private
        alumno.nombre = "Fernando";
        */
        System.out.println("--------------------- Creando la instancia de la clase Alumno Internacional ----------------------------");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("John");
        alumnoInt.setApellido("Winick");
        alumnoInt.setPais("Finlandia");
        alumnoInt.setUniversidad("UNC");
        alumnoInt.setNotasAlgebra(9.0);
        alumnoInt.setNotasAnalisis(6.5);
        alumnoInt.setNotasIngles(10.0);

        System.out.println("--------------------- Creando la instancia de la clase Profesor ----------------------------");

        Profesor profe = new Profesor();
        profe.setNombre("Soledad");
        profe.setApellido("Romero");
        profe.setMateria("Diseño de sistemas");

        System.out.println( alumno.getNombre() + " " + alumno.getApellido() + " "
                            + alumno.getUniversidad() + "\n\t--NOTAS-- \n" + "Algebra: " +
                            alumno.getNotasAlgebra() + "\nAnalisis: " + alumno.getNotasAnalisis() +
                            "\nInges: " + alumno.getNotasIngles()
                        );

        System.out.println();

        System.out.println( alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " de "
                + alumnoInt.getPais() + " estudia en "+ alumnoInt.getUniversidad()
                + "\n\t--NOTAS-- \n" + "Algebra: " +   alumnoInt.getNotasAlgebra() + "\nAnalisis: " +
                alumnoInt.getNotasAnalisis() + "\nIdiomas: " + alumnoInt.getNotaIdiomas()
        );

        System.out.println();
        System.out.println("Profesor de " + profe.getMateria() + ": "
                + profe.getApellido() + ", " + profe.getNombre());

        // --------------------------------------------
        System.out.println();
        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
