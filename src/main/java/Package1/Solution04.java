package Package1;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*This program will prompt a user for the parts of a sentence
 *noun, verb, adjective, adverb
 *it will then record all of it to a variable each
 *Then will print it all in one sentence
 */

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = Input.next();
        System.out.print("Enter a verb: ");
        String verb = Input.next();
        System.out.print("Enter an adjective: ");
        String adjective = Input.next();
        System.out.print("Enter an adverb: ");
        String adverb = Input.next();

        System.out.println("Do you " + verb + " your " + adjective
                 + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
