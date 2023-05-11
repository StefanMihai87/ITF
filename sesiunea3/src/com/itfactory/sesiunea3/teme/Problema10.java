package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Problema10 {
    /*
    Se citesc doua variabile de tip String de la tastatura, din care unul va reprezenta un text oarecare, iar cel de al doilea reprezinta un keyword care se va cauta in text.
   Se cere sa se numere de cate ori apare keyword-ul in textul respectiv.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();
        System.out.println("Introduceti keyword-ul: ");
        String keyword = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == keyword.charAt(0)) {
                int j = 0;
                while (j < keyword.length() && text.charAt(i + j) == keyword.charAt(j)) {
                    j++;
                }
                if (j == keyword.length()) {
                    count++;
                }
            }
        }
        System.out.println("Keyword-ul apare de " + count + " ori in text.");
    }
}
