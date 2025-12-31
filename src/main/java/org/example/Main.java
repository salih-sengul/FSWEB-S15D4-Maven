package org.example;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        /*assertEquals(Main.convertDecimalToBinary(5), "101");
        assertEquals(Main.convertDecimalToBinary(6), "110");
        assertEquals(Main.convertDecimalToBinary(13), "1101");*/

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String string){
        String temizlenmis = string.toLowerCase().replaceAll("[^a-zA-Z]","");

        char[] charArray = temizlenmis.toCharArray();

        List<String> karakterList = new LinkedList<>();
        for(char c: charArray){
            karakterList.add(String.valueOf(c));
        }
        int j = 0;

        List<String> tersListe = new LinkedList<>(karakterList);
        Collections.reverse(tersListe);
        for(int i = 0; i<karakterList.size();i++){
            if(!karakterList.get(i).equals(tersListe.get(i))){
                j++;
            }
        }
        return j <= 0;
    }

    public static String convertDecimalToBinary(int a){
        int bolum = a;
        int mod=0;
        List<String> binary = new LinkedList<>();
        while(!(bolum==0)){
            mod = bolum%2;
            bolum = bolum/2;

            binary.add(String.valueOf(mod));
        }
        Collections.reverse(binary);
        String listString = binary.toString();
        String.join(listString);

        return listString.replaceAll("[^0-9]","");
    }

}