package org.ferdev.oop_interfaces.imprenta;

import org.ferdev.oop_interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...", new Persona("Fernando","Avila"), "Desarrollador " +
                "JAVA");
        cv.addExperiencia("Desarrollador PHP - Insis")
        .addExperiencia("Desarrollador Java - Incluit")
        .addExperiencia("Desarrollador Java - Bitlogic¿?")
        .addExperiencia("Desarrollador Fullstack");

        Informe informe = new Informe("Microservicios SpringBoot", new Persona("Marcelo", "Cejas"),
                new Persona("Soledad","Romero"));

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
            .addPagina(new Pagina("Patrón Observador"))
            .addPagina(new Pagina("Patrón Factory"))
            .addPagina(new Pagina("Patrón Composite"))
            .addPagina(new Pagina("Patrón Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
