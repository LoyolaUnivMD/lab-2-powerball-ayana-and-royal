// Programmers:  [Royal Ibeadogbulem]
// Course:  CS 212
// Due Date: 2/7/2024
// Lab Assignment: 2
// Problem Statement: Create a program that generates 10 lottery tickets
// Data In: First and last Name
// Data Out: Last Name

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
//Import necessary classes
class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L; // Set prize value to variable
        Scanner input = new Scanner(System.in); //Create scanner to read input
        Random rand = new Random(); //Create object to create random
        DecimalFormat fmt = new DecimalFormat("#00"); // Formats numbers to 2 places
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets."); //Output Purpose
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine(); // Ask for user input

        System.out.println("Here are the ticket: ");
        for (int i = 0; i < 10 ; i++){ //Create each ticket
            for(int x = 0; x < 6 ; x++){
                System.out.print(fmt.format(rand.nextInt(99)) + " "); //Assign a random integer to each ticket number place
            }
            System.out.println();
        }
        String[] name = customerName.split(" "); //Separates first and last name

        System.out.println("-----------------");
        System.out.println("Good luck " + name[0] + "!"); //Outputs first name
        System.out.println("Estimated Jackpot: ");
        System.out.println("$" + prize); // potential winning prize
        System.out.println("-----------------");
    }
}
