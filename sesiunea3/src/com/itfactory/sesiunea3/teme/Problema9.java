package com.itfactory.sesiunea3.teme;

import java.util.Scanner;
public class Problema9 {
    /*
    Creati un program prin care, avand un text introdus la tastatura, sa se numere cate caractere mici are textul si cate caractere mari are acel text.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();
        int countMici = 0;
        int countMari = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                countMici++;
            } else if (Character.isUpperCase(text.charAt(i))) {
                countMari++;
            }
        }
        System.out.println("Textul are " + countMici + " caractere mici si " + countMari + " caractere mari.");
    }
}
