package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Problema2 {
    /*
    Sa se creeze un program in care se citeste un sir de caractere de la tastatura care va reprezenta numele unui candidat la introducerea intr-un sistem de contabilitate.
In cazul in care numele introdus depaseste lungimea de 25 de caractere, afisati mesajul urmator: "Numele introdus este prea lung pentru sistem".
Aspecte:
1. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar: "Introduceti numele candidatului: ".

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele candidatului: ");
        String nume = scanner.nextLine();
        if (nume.length() > 25) {
            System.out.println("Numele introdus este prea lung pentru sistem");
        }
    }
}
