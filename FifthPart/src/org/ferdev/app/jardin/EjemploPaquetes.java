package org.ferdev.app.jardin;

import org.ferdev.app.hogar.ColorPelo;
import org.ferdev.app.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Fernando");
        p.setApellido("Avila");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Pichi";
        perro.raza = "Bulldog";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = Persona.saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = Persona.GENERO_FEMENINO;
        String generoHombre = Persona.GENERO_MASCULINO;
    }
}
