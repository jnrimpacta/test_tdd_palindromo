package com.impacta.palindromo;

public class Palindromo {

    public boolean isPalindromo(String str) {

        String strFilter = str.toUpperCase().replace(" ", "").replace("-", "").replace(",", "").replace("'", "").replace("/", "");
        
        for (int i = 0; i < strFilter.length(); i++) {

            if(strFilter.charAt(i) != strFilter.charAt(strFilter.length() - (i+1))) {
                return false;
            }

        }
        
        return true;

    }

}
