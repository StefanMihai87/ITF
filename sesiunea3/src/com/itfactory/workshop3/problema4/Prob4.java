package com.itfactory.workshop3.problema4;

public class Prob4 {
    /*
    Se da un text citit de la tastatura (sau dintr-o variabila String). Pentru delimitarea cuvintelor se vor folosi doar spatii.
Se cere sa se determine cate cuvinte distincte sunt in textul dat.
Exemplu de text. "mar mar par par cireasa". Sunt 3 cuvinte distincte in acest text. (mar, par, cireasa).
Pentru toata lumea: Pentru a sparge un text in cuvinte ne folosim de metoda split din String. metoda split ne va returna un array de string-uri. (vezi documentatie).
String[] cuvinte = textulMeu.split("\\s+") (O sa spargem textul in cuvinte in functie de spatiile dintre cuvinte)

     */
    public static void main(String[] args) {
        String text = "mar mar par par cireasa cireasa cireasa caisa caisa caisa piesica piesica piesica strugure strugure strugure";
        String[] cuvinte = text.split("\\s+");
        int count = 0;
        for (int i = 0; i < cuvinte.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (cuvinte[i].equals(cuvinte[j])) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                count++;
            }
        }
        System.out.println("Numarul de cuvinte distincte din text este: " + count);
    }
}
