/*
* UCF COP 3330 Fall 2021 Assignment 20 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner tax = new Scanner(System.in);
        System.out.println("What is the order amount? ");
        int order = tax.nextInt();
        System.out.println("What state do you live in? ");
        String state = tax.next();
        System.out.println("What county do you live in? ");
        String county = tax.next();

        double taxes=0;

        String test1 = "Wisconsin";
        String test2= "Illinois";
        String test3 = "Eau Claire";
        String test4 = "Dunn";

        if(state.equals(test1)){
            taxes+=0.50;
            if(county.equals(test3))
            {
                taxes+=0.005;
            }
            else if(county.equals(test4))
            {
                taxes+=0.004;
            }
        }

        else if(state.equals(test2)){
            taxes+=0.80;
        }

        double total = order + taxes;

        System.out.printf("The tax is $%.2f%nThe total is $%.2f.", taxes, total);
    }
}