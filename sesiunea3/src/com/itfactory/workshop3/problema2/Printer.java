package com.itfactory.workshop3.problema2;

public class Printer {
    public static void main(String[] args) {
        Task task = new Task() {
            @Override
            public void executa() {
                System.out.println("Hello World!");
            }
        };
    }
}
