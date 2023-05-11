package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Problema3 {
    /*
    Sa se creeze un program in care se calculeaza pretul unei cantitati de produse. Pentru aceasta se vor citi urmatoarele 3 variabile: numele produsului, pretul produsului si cantitatea.
Se cere ca in functie de datele introduse sa se calculeze pretul final. Se va afisa un mesaj similar: "Pentru produsele de tip {nume produs} si cantitatea {cantitate} , pretul este de {pret calculat}";
Aspecte:
1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"

     */
    public static void main(String[] args) {
        String numeProdus ;
        double pretProdus = 2.5;
        int cantitate = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele produsului: ");
        numeProdus = scanner.nextLine();
        System.out.println("Introduceti cantitatea: ");
        cantitate = scanner.nextInt();
        double pretFinal = pretProdus * cantitate;
        System.out.println("Pentru produsele de tip " + numeProdus + " si cantitatea " + cantitate + " , pretul este de " + pretFinal);
    }
}
