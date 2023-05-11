package com.itfactory.sesiunea3.teme;

import java.util.Locale;
import java.util.Scanner;

public class Problema4 {
    /*
    Sa se creeze un program in care se va citi de la tastatura siruri de caractere pana cand introduc textul "stop";
Aspecte.
1. Se va folosi bucla "while"

Simulare:
Introduceti textul: masina
Introduceti textul: avion
Introduceti textul: stop

Am iesit din program.

     */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String text = "";
        while (!text.equals("stop")) {
            System.out.println("Introduceti textul: ");
            text = scanner.nextLine().toLowerCase();
        }
        System.out.println("Am iesit din program.");

//    boolean flag = true;
//    Scanner scanner = new Scanner(System.in);
//    String target = "stop";
//    while (flag) {
//        System.out.println("Introduceti textul: ");
//        String text = scanner.nextLine().toLowerCase();
//        if (text.equals(target)) {
//            flag = false;
//            break;
//        }
//        }
    }
}
