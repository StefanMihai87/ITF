package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        /*
        Sa se creeze un program prin care se citeste de la tastatura un user si o parola. In prealabil, acestea trebuie sa mimeze autentificarea unui user intr-un sistem.
Daca userul si parola sunt aceleasi cu cele prestabilite, afisati un mesaj de tipul: "Userul {user} s-a autentificat in aplicatie." (Unde {user} este userul introdus).
In cazul in care cel putin una din valorile citite (user sau parola) nu este egala cu valoarea prestabilita, se afiseaza mesajul "Credentiale gresite".
Aspecte:
1. Pentru userul si parola prestabilite se definesc 2 stringuri in program.
2. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar: "Introduceti userul: " / "Introduceti parola: ".
        */

        Scanner scanner = new Scanner(System.in);

        String userName = "TestUser";
        String userPassword = "TestPassword";
        System.out.println("Introduceti un user name" );
        String user = scanner.nextLine();
        if (user.equals(userName)) {
            System.out.println("Autentificare reusita");
        }else {
            System.out.println("Introduceti un user valid" );
        }
        System.out.println("Introduceti password: ");
        String password = scanner.nextLine();
        if (password.equals(userPassword)) {
            System.out.println("Autentificare reusita");
        }else {
            System.out.println("Introduceti o parola valid");
        }
    }
}
