package com.itfactory.sesiunea4.oop.inharitance;

public class Sesiunea3 {
    public static void main(String[] args) {

        String vecin = "Vasile";
        String vecin2 = "Vasile";
        String vecin5 = new String("Georghita");

        System.out.println(vecin==vecin2); // ne arata daca este adevarat sau false

        System.out.println(vecin5);
        String vecin3 = new String("Vasile"); // daca punem new se creaza in alta locatie chiar daca are acelasi nume
        System.out.println(vecin3.equals(vecin)); // compara continutul stringului nu locatia lui



    }
}
