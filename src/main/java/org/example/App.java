/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is your current age? " );
        Scanner s = new Scanner(System.in);
        String fir = s.nextLine();
        System.out.println("At what age would you like to retire?");
        String sec = s.nextLine();
        Integer i = Integer.valueOf(fir);
        Integer j = Integer.valueOf(sec);
        System.out.println("You have " + (j - i) + " years left until you can retire.");
        System.out.println("It's " + Year.now().getValue());
    }
}
