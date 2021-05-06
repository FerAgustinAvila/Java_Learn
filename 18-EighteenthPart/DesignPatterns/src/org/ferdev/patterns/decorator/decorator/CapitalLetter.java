package org.ferdev.patterns.decorator.decorator;

import org.ferdev.patterns.decorator.Format;

public class CapitalLetter extends Text {
    public CapitalLetter(Format texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
