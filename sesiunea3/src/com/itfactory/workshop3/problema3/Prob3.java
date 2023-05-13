package com.itfactory.workshop3.problema3;

public class Prob3 {
    /*
    1. Se da o lista de numere întregi. Sa se afișeze cel mai mare număr din lista
    2. Se da o lista de String-uri aleatoriu (construiți voi lista).
       Se cere sa se afișeze string-ul cu cea mai mare lungime. Dacă sunt mai multe string-uri cu aceeași lungime maxima se vor afișa toate
    3. Se dau doua liste de numere întregi (sau string-uri la alegerea voastră).
       Sa se creeze o lista ce conțin elementele comune din cele doua liste

     */
    public static void main(String[] args) {

        System.out.println("=========Cerinta 1=========");

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println("Cel mai mare numar din lista este: " + max);

        System.out.println("=========Cerinta 2=========");

        String[] listaString = {"mar", "banane", "casa", "tastatura", "electromecanic", "sare", "pestera", "cladire", "acoperis", "pamant"};
        String maxString = listaString[0];
        for (int i = 1; i < listaString.length; i++) {
            if (listaString[i].length() > maxString.length()) {
                maxString = listaString[i];
            }
        }
        System.out.println("Cel mai mare string din lista este: " + maxString);

        System.out.println("=========Cerinta 3=========");

        int[] lista2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] listaNoua2 ={6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int i = 0; i < lista2.length; i++) {
            for (int j = 0; j < listaNoua2.length; j++) {
                if (lista2[i] == listaNoua2[j]) {
                    System.out.println("Elementele comune din cele doua liste sunt: " + lista2[i]);
                }
            }
        }
    }
}
