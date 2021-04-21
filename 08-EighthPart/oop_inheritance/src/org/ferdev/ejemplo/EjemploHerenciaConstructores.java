package org.ferdev.ejemplo;

import org.ferdev.inheritance.Alumno;
import org.ferdev.inheritance.AlumnoInternacional;
import org.ferdev.inheritance.Persona;
import org.ferdev.inheritance.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("--------------------- Creando la instancia de la clase Alumno ----------------------------");
        Alumno alumno = new Alumno("Fernando", "Avila", 25, "UTN - FRC");
        alumno.setNotasAlgebra(8.5);
        alumno.setNotasAnalisis(7.5);
        alumno.setNotasIngles(10.0);
        alumno.setEmail("ferdev@correo.com");

        /*
        Si el atributo nombre fuese protected y no private
        alumno.nombre = "Fernando";
        */
        System.out.println("--------------------- Creando la instancia de la clase Alumno Internacional ----------------------------");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("John","Winick", "Finlandia");
        alumnoInt.setUniversidad("UNC");
        alumnoInt.setNotasAlgebra(9.0);
        alumnoInt.setNotasAnalisis(6.5);
        alumnoInt.setNotasIngles(10.0);
        alumnoInt.setEmail("john@correo.com");

        System.out.println("--------------------- Creando la instancia de la clase Profesor ----------------------------");
        Profesor profe = new Profesor("Soledad", "Romero", "Diseño de sistemas");
        profe.setEdad(47);
        profe.setEmail("soleprofe@correo.com");

        System.out.println(" ============================================ ");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profe);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo Persona");
        System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido() + "\nEdad: "
                + persona.getEdad() + "\nEmail: " + persona.getEmail() );

        if(persona instanceof Alumno){
            System.out.println("\nImprimiendo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getUniversidad());
            System.out.println("Nota Algebra: " + ((Alumno) persona).getNotasAlgebra());
            System.out.println("Nota Ingles: " + ((Alumno) persona).getNotasIngles());

            if (persona instanceof  AlumnoInternacional){
                System.out.println("\nImprimiendo Alumno Internacional");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println(" ==================== OVERRIDE Promedio ======================== ");

            System.out.println( ((Alumno) persona).calcularPromedio() );

            System.out.println(" ============================================ ");
        }

        if (persona instanceof Profesor){
            System.out.println("\nImprimiendo Profesor");
            System.out.println("Materia: " + ((Profesor) persona).getMateria());
        }
        System.out.println(" ==================== OVERRIDE Saludar ======================== ");

        System.out.println( persona.saludar() );

        System.out.println(" ============================================ ");
    }
}
