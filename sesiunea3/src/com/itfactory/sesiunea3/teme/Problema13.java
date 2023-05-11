package com.itfactory.sesiunea3.teme;

public class Problema13 {
/*
Creati un proiect cu titlul FormeGeometrice in care se cere sa se implementeze urmatoarele cerinte:
1. Veti avea pachetul de baza com.itfactory
TRIUNGHI:
2. Se va crea o clasa Triunghi impreuna cu 3 proprietati, si anume laturile acestuia. (Pentru fiecare latura definiti un field in clasa)
3. Constructorul va fi ales la alegere (Daca o sa implementati constructor cu parametri, nu va fie nevoie de setters si getters)
4. Sa se creeze o metoda in clasa Triunghi care returneaza perimetrul triunghiului calculat.
PATRAT:
5. Se va crea o clasa Patrat impreuna cu o proprietate care este dimensiunea unei laturi.
6. Se cere sa se creeze doua metode in clasa, una care calculeaza perimetrul unui patrat, iar unul care calculeaza aria unui patrat.
(Perimetrul este suma laturilor unui patrat iar aria este latura la patrat. Atentie: Patratul are toate laturile egale).
DREPTUNGHI:
5. Se va crea o clasa Dreptunghi impreuna cu doua proprietati care reprezinta lungimea si latimea
6. Se cere sa se creeze doua metode in clasa, una care calculeaza perimetrul unui dreptunghi, iar unul care calculeaza aria unui dreptunghi.
(Perimetrul este suma latimilor si a lungimilor unui dreptunghi iar aria este produsul lungimii cu cel al latimii. Atentie: Dreptunghiul are cate 2 laturi egale).

 */
public static void main(String[] args) {

        Triunghi triunghi = new Triunghi(3, 4, 5);
        System.out.println("Perimetrul triunghiului este: " + triunghi.getPerimetru());

        Patrat patrat = new Patrat(5);
        System.out.println("Perimetrul patratului este: " + patrat.getPerimetru());
        System.out.println("Aria patratului este: " + patrat.getArie());

        Dreptunghi dreptunghi = new Dreptunghi(5, 10);
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghi.getPerimetru());
        System.out.println("Aria dreptunghiului este: " + dreptunghi.getArie());
}

}

