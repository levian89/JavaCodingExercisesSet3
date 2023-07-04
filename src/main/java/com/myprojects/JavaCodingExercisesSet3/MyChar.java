package com.myprojects.JavaCodingExercisesSet3;

import java.util.Scanner;

public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
            case 'A', 'E', 'I', 'O', 'U':                    //enhanced type of switch
            case 'a', 'e', 'i', 'o', 'u': return true;
            default: return false;
        }
    }

    public boolean isDigit(char ch) {
        switch (ch) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9': return true;
            default: return false;
        }
    }

    public static void main(String[] args) {
        MyChar myChar = new MyChar();
        System.out.println(myChar.isVowel('a'));
        System.out.println(myChar.isDigit('d'));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = scanner.next().charAt(0);
        System.out.println("Character introduced is digit: " + myChar.isDigit(c));
        System.out.println("Character introduced is vowel: " + myChar.isVowel(c));
    }
}