/*
 * BasicCardDemo.java
 *
 * A class to demonstrate the use of the Card class
 *
 * Code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * DO NOT MODIFY THIS FILE.
 */
package com.company;
public class BasicCardDemo{
    public static void main(String[] args){

        // Call the Card constructor with three parameters
        // to create a Card object for the ace of clubs with a value of 11.
        // We assume that
        // DIAMONDS = 0, HEARTS = 1; CLUBS = 2; and SPADES = 3.
        Card c1 = new Card(1, 2, 11);

        System.out.println("The ace of clubs has");
        System.out.println("rank " + c1.getRank());
        System.out.println("suit " + c1.getSuit());
        System.out.println("value " + c1.getValue());

        System.out.println();

        System.out.println("Value is changed to");
        c1.setValue(1);
        System.out.println(c1.getValue());

        System.out.println();

        System.out.println("Now the card is " + c1.toString());
        System.out.println(Card.SUIT_NAMES[3]);
    }
}
