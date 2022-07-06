package org.charrepeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String word = "casasa";
        Map<Character, Integer> wordMap = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++){
            if ( !(wordMap.containsKey(word.charAt(i))) ){
                wordMap.put(word.charAt(i), 1);
            } else {
                wordMap.put(word.charAt(i), wordMap.get(word.charAt(i))+1);
            }
        }

        Integer may = 0;
        Character charMay = null;
        boolean varios = false;
        ArrayList charVarios = new ArrayList();
        for (Map.Entry<Character, Integer> letra : wordMap.entrySet()){
            Character letter = letra.getKey();
            Integer valor = letra.getValue();

            if ( may < valor){
                charMay = letter;
                may = valor;
            } else if( may == valor){
                varios = true;
                charVarios.add( charMay );
                charVarios.add( letter );
            }
        }

        if ( varios ){
            System.out.println("Los caracteres "  + charVarios + "se repiten " + may);
        } else {
            System.out.println("El caracter " + charMay + " se repite " + may);
        }
    }
}
