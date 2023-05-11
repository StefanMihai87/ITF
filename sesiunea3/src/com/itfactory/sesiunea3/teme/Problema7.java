package com.itfactory.sesiunea3.teme;

public class Problema7 {
    /*
    Se da urmatorul text:
"avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina"
Scrieti un program prin care sa se inlcouiasca primele 5 instante ale cuvantului "avion" cu cuvantul "racheta" si primele 3 instante ale cuvantului "masina" cu cuvantul "autobuz" din textul dat.

Aspecte.
2. Output: racheta racheta racheta racheta racheta avion avion avion , autobuz autobuz autobuz masina masina masina masina

     */
    public static void main(String[] args) {
        String text = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";
        String text1 = text.replaceFirst("avion","racheta");
        String text2 = text1.replaceFirst("avion","racheta");
        String text3 = text2.replaceFirst("avion","racheta");
        String text4 = text3.replaceFirst("avion","racheta");
        String text5 = text4.replaceFirst("avion","racheta");
        String text6 = text5.replaceFirst("masina","autobuz");
        String text7 = text6.replaceFirst("masina","autobuz");
        String text8 = text7.replaceFirst("masina","autobuz");
        System.out.println(text8);
    }
}
