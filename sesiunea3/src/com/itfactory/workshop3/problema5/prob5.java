package com.itfactory.workshop3.problema5;

import java.util.Scanner;

public class prob5 {
    /*
    Sa se verifice daca un numar citit de la tastatura este palindrom sau nu.
Exemplu: 991199 este palindrom, deoarece numarul citit invers este ca cel initial. Alte exemple de palindrom: 121, 22322, 556655, 4432344.
 Numarul citit se va converti in array de char continand fiecare cifra in ordine.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        int numarInversat = 0;
        int numarInitial = numar;
        while (numar != 0) {
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }
        if (numarInitial == numarInversat) {
            System.out.println("Numarul " + numarInitial + " este palindrom.");
        } else {
            System.out.println("Numarul " + numarInitial + " nu este palindrom.");
        }
    }
}
