/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 03 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex03;
import java.util.Scanner;

public class ex03 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String userQuote = userInputScanner.nextLine();
        System.out.print("Who said it? ");
        String userQuoteAuthor = userInputScanner.nextLine();

        System.out.print(userQuoteAuthor + " says, \"" + userQuote + "\"");

    }
}
