package com.itfactory.workshop3.problema1;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaArray {
    /*
    Sa se creeze o clasa simpla (ProblemaArray) in care se va defini main.
Pentru aceasta problema se cere să se inițieze un array de stringuri citite de la tastatura. (Numărul il stabiliti voi. Alegeți cel putin 3 elemente ca sa nu fie nici 1 sau 2 ca nu ar mai avea sens array-ul).

Se cere sa se construiască un alt array de stringuri de aceeași dimensiune in care sa se introduca elementele din primmul array construit in ordine inversa. (Acesta nu il mai veti citi de la tastatura)
Exemplu:
array1 in care elementele sunt citite de la tastatura: mar par cireasa banana
array2 pe care il veti construi pe baza array1: banana cireasa par mar.
Se vor afisa ambele array-uri element cu element folosind parcurgerea cu for.
     */
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

                System.out.println("Introduceti numarul de elemente: ");

                int numarElementeArray = scanner.nextInt();

                String[] array = new String[numarElementeArray];

                for (int i = 0; i < numarElementeArray; i++) {
                    System.out.println("Introduceti elementul: " + (i + 1) );
                    array[i] = scanner.next();
                }
                System.out.println(Arrays.toString(array));

                String[] array2 = new String[numarElementeArray];
                for (int i = 0; i < numarElementeArray; i++) {
                    array2[i] = array[numarElementeArray - 1 - i];
                }
                System.out.println(Arrays.toString(array2));

                for (int i = 0; i < numarElementeArray; i++) {
                    System.out.println(array[i] + " " + array2[i]);
                }
    }
}
