package com.itfactory.sesiunea3.teme;

import java.util.Scanner;

public class Extra {
    /*
    You need to write a simple Java program to check if a given String is palindrome or not.
 A Palindrome is a String which is equal to the reverse of itself, e.g.,
"Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
Though be prepared with both recursive and iterative solution of this problem
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Textul este palindrom.");
        } else {
            System.out.println("Textul nu este palindrom.");
        }
    }
}
