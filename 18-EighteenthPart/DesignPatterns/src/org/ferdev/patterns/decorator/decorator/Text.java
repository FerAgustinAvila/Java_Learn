package org.ferdev.patterns.decorator.decorator;

import org.ferdev.patterns.decorator.Format;

abstract public class Text implements Format {
    protected Format texto;

    public Text(Format texto) {
        this.texto = texto;
    }
}
