package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Problema11 {
    /*
    Sa se implementeze joculetul Fazan. (Studiati metoda substring cu doi parametri/argumenti) - https://beginnersbook.com/2013/12/java-string-substring-method-example/
   Fazan presupune ca intr-un grup de membri, fiecare va incerca sa formeze un cuvant incepand cu cu ultimele doua litere ale cuvantului precedent.
   O sa alegeti un cuvant initial aleatoriu (presupunem ca incepe calculatorul).
   			Daca utilizatorul introduce un cuvant care nu incepe cu acea grupare, jocul se termina
   			Daca sunteti blocati in a introduce un cuvant (Exemplu: dupa cuvintele care se termina in "nt") utilizatorul o sa introduca un String empty iar programul se termina.

   Cuvant de inceput: "animal".
   Introduceti un cuvant care incepe cu "al": alfabet
   Introduceti un cuvant care incepe cu "et": etaj
   Introduceti un cuvant care incepe cu "aj": altceva
   Jocul s-a terminat!

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cuvant = "animal";
        System.out.println("Primul cuvant al jocului este: " + cuvant);

        String cuvantUtilizator = "scanner.nextLine()";
        while (cuvantUtilizator.length() > 0) {
                    System.out.println("Introduceti un cuvant care incepe cu " + cuvant.charAt(cuvant.length() - 2) + cuvant.charAt(cuvant.length() - 1) + ": ");
                    cuvantUtilizator = scanner.nextLine();
                    if (cuvantUtilizator.length() > 0 && cuvantUtilizator.charAt(0) == cuvant.charAt(cuvant.length() - 2) && cuvantUtilizator.charAt(1) == cuvant.charAt(cuvant.length() - 1)) {
                        cuvant = cuvantUtilizator;
                    } else {
                        System.out.println("Jocul s-a terminat!");
                        break;
                    }
                }
    }
}