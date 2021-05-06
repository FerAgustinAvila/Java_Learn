package org.ferdev.patterns.decorator;

public class Text implements Format {
    private String texto;

    public Text(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String darFormato() {
        return getTexto();
    }
}
