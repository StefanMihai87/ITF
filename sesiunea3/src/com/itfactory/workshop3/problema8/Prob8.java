package com.itfactory.workshop3.problema8;

import java.awt.*;
import java.util.Collections;
import java.util.Map;

public class Prob8 {
    /*
    Se da un map unde cheile sunt de tip int (atentie la int) iar valorile sunt de tip lista de int (atentie la int).
-	Fiecare element va fi o pereche de forma (int, list de int).
-	Se cere ca pentru fiecare element din map sa se afiseze cheia, si maximul din lista asociată.

     */
    public static void main(String[] args) {
        Map<Integer, java.util.List<Integer>> map = Map.of(
                1, java.util.List.of(1, 2, 3, 4, 5),
                2, java.util.List.of(6, 7, 8, 9, 10),
                3, java.util.List.of(11, 12, 13, 14, 15)
        );
        for (Map.Entry<Integer, java.util.List<Integer>> entry : map.entrySet()) {
            System.out.println("Cheia este: " + entry.getKey() + " iar maximul este: " + Collections.max(entry.getValue()));
        }
    }
}
