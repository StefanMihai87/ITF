package com.itfactory.workshop3.problema1;

import java.util.List;
import java.util.ArrayList;

public class ProblemaListe {
    /*

Se cere sa se creeze o lista de numere intregi (folosind List din java).
Folosind o bucla while se cere sa se genereze numere intregi (folosind Random) pana in momentul in care numarul generat este 10. (cand se genereaza 10 se iese din bucla).
Fiecare numar generat pana la intalnirea lui 10 este introdus in lista de mai sus.
Mai departe, daca lista va contine elemente se vor numara cate aparitii ale numarului 5 sunt.
Indicatii:
1.Se va folosi metoda isEmpty() din obietul de tip lista pentru verificare daca lista este goala

Exemplu de rulare:
Presupunem ca s-au generat numerele 2 5 4 16 5 11 18 5 7 10 (la 10 ma opresc)
Introduc numerele intr-0 lista.
Parcurg lista si cand intalnesc valoarea 5 incrementez un contor. (Un contor inseamna  ca ne definim o variabila de tip int pe care o incrementam cand intalnim valoarea 5 in lista).

     */
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int numarGenerat = 0;
        while (numarGenerat != 10) {
            numarGenerat = (int) (Math.random() * 100);
            lista.add(numarGenerat);
        }
        System.out.println(lista.isEmpty());

        System.out.println(lista);

        int contor = 0;
        for (Integer numar : lista) {
            if (numar == 5) {
                contor++;
            }
        }
        System.out.println("Numarul 5 apare de " + contor + " ori");

    }

}
