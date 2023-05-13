package com.itfactory.workshop3.problema7;

import java.util.HashSet;

public class Prob7 {
    /*
    Se da o lista de String-uri . Printr-o linie de cod, transformati lista intr-un set.

     */
    public static <Set> void main(String[] args) {
        String[] lista = {"Ion", "Maria", "Vasile", "Ion", "Maria", "Vasile"};
        HashSet<String> set = new HashSet<>();
        for (String element : lista) {
            set.add(element);
        }
        System.out.println(set);

    }
}
