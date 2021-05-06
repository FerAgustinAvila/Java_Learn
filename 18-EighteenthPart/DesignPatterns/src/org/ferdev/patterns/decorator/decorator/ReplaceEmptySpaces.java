package org.ferdev.patterns.decorator.decorator;

import org.ferdev.patterns.decorator.Format;

public class ReplaceEmptySpaces extends Text {
    public ReplaceEmptySpaces(Format texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
