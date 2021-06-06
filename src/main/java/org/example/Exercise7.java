/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 7 - Area of a Rectangular Room

package org.example;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        //Get length and width of room from user
        Scanner getLength = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length = getLength.nextLine();
        Integer i=Integer.parseInt(length);

        Scanner getWidth = new Scanner(System.in);
        System.out.print("What is the width of the room in feet? ");
        String width = getWidth.nextLine();
        Integer j=Integer.parseInt(width);

        System.out.println("You entered dimensions of " +length+ " feet by " +width+ " feet.");

        //area calculation and print out for feet
        int areaft = i*j;

        System.out.println(String.format("The area is \n%d square feet", areaft));

        //area calculation and print out for square meters
        double sqmeters = areaft * 0.09290304;
        System.out.println(String.format("%.03f square meters", sqmeters));

    }
}
