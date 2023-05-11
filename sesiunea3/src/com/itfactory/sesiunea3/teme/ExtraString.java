package com.itfactory.sesiunea3.teme;

public class ExtraString {
    /*
    Se da un String. Ex String cuvant = "tralalalaabcd"
Scrieti o metoda care sa returneze cuvantul in ordine inversa : dcbaalalalart

     */
    public static void main(String[] args) {
        String cuvant = "tralalalaabcd";
        String cuvantInvers = "";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            cuvantInvers += cuvant.charAt(i);
        }
        System.out.println(cuvantInvers);
    }
}
