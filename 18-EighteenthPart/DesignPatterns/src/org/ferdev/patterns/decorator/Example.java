package org.ferdev.patterns.decorator;

import org.ferdev.patterns.decorator.decorator.CapitalLetter;
import org.ferdev.patterns.decorator.decorator.ReplaceEmptySpaces;
import org.ferdev.patterns.decorator.decorator.Reverse;
import org.ferdev.patterns.decorator.decorator.Underlined;

public class Example {
    public static void main(String[] args) {
        Format texto = new Text("Hola que tal Andrés!");

        CapitalLetter mayuscula = new CapitalLetter(texto);
        Reverse reversa = new Reverse(mayuscula);
        Underlined subrayar = new Underlined(reversa);
        ReplaceEmptySpaces remplazar = new ReplaceEmptySpaces(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
