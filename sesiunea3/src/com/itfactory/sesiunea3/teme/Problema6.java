package com.itfactory.sesiunea3.teme;

public class Problema6 {
    /*
    Se da urmatorul text:
"Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook."
Sa se scrie un program prin care sa se corecteze textul si sa se inlocuiasca cuvintele gresite:
Aspecte:
1. "NumePrenume" - se va inlocui cu numele cursantului.
2. "testare" - se va inlocui cu tipul de curs la care participati.
3. "facebook" - se va inlocui cu numele companiei unde participati la curs.

     */
    public static void main(String[] args) {
        String text = "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook.";
        String text1 = text.replace("NumePrenume","Mihai Stefan");
        String text2 = text1.replace("testare","Java");
        String text3 = text2.replace("facebook","ITFactory");

        System.out.println(text3);
    }
}
