package org.ferdev.patterns.decorator.decorator;

import org.ferdev.patterns.decorator.Format;

public class Underlined extends Text {
    public Underlined(Format texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for(int i = 0; i < largo;i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
