package org.ferdev.patterns.observer.examples;

import org.ferdev.patterns.observer.UserRepository;

public class Example_02 {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        repo.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario " +
                u + " en el logs"));
        repo.crearUsuario("Andrés");
    }
}
