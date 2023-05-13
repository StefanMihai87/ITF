package com.itfactory.workshop3.problema6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    /*
    Sa se creeze doua clase in Java si anume clasa Persoana cu fieldurile [id, nume] si clasa Departament cu fieldurile [numeDepartament]. (Atentie la metodele pe care trebuie sa le generati/suprascrieti in clase)
    Intr-o clasa Main cu metoda main se va crea un map in care cheile (key) vor fi de tip Persoana iar valorile (value) vor fi de tip Departament.
-	Se vor introduce initial (nu trebuie citit de la tastatura neaparat) un numar de persoane din acelasi departament. (Minim 3 persoane).
-	Mai departe vom simula schimbarea departamentului unei persoane.
-	Se cere sa se introduca de la tastatura id-ul si numele unei persoane. Daca Id-ul si numele coincid cu una din Persoanele introduse, se cere mai apoi sa se introduca numele departamentului nou in care o sa fie persoana respectiva.
-	Daca departamentul este deja cel asignat persoanei, se va afisa un mesaj de eroare si programul se va incheia. Daca departamentul nu este asignat persoanei respective, se va crea departamentul si se va asigna persoanei respective.

     */
    public static void main(String[] args) {


        Map<Persoane, Departament> map = new HashMap<>();
        new Persoane(1, "Ion");
        new Departament("IT");
        new Persoane(2, "Maria");
        new Departament("IT");
        new Persoane(3, "Vasile");
        new Departament("IT");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul persoanei: ");
        int id = scanner.nextInt();
        if (id < 1 || id > 3) {
            System.out.println("Id-ul introdus nu este valid");
            return;
        }

        System.out.println("Introduceti numele persoanei: ");
        String nume = scanner.next();
        if (!nume.equals("Ion") && !nume.equals("Maria") && !nume.equals("Vasile")) {
            System.out.println("Numele introdus nu este valid");
            return;
        }
        System.out.println("Introduceti numele departamentului nou: ");
        String numeDepartament = scanner.next();
        if (numeDepartament.equals("IT")) {
            System.out.println("Persoana " + nume + " este deja in departamentul " + numeDepartament);
        } else {
            map.replace(new Persoane(id, nume), new Departament(numeDepartament));
            System.out.println("Persoana " + nume + " a fost mutata in departamentul " + numeDepartament);
        }
    }
}






















/*
 */