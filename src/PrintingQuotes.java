/*
 * UCF COP3330 Fall 2021 Assignment 1.3 Solution
 * Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        System.out.print("What is the quote? ");
        Scanner quote = new Scanner(System.in);
        String quote1 = quote.nextLine();

        System.out.print("Who said it? ");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();

        String sentence1 = " says, \"";
        String sentence2 = ".\"";
        System.out.println(name1 + sentence1 + quote1 + sentence2);



    }
}
