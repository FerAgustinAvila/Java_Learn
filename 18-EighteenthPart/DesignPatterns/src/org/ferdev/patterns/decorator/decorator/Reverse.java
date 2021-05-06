package org.ferdev.patterns.decorator.decorator;

import org.ferdev.patterns.decorator.Format;

public class Reverse extends Text {
    public Reverse(Format texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
