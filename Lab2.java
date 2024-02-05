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
        Scanner input = new Scanner(System.in); //Create scanner to read input
        Random rand = new Random(); //Create object to create random
        DecimalFormat fmt = new DecimalFormat("#00"); // Formats numbers to 2 places
        DecimalFormat mon = new DecimalFormat("$0.00");// Formats numbers to dollar price
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets."); //Output Purpose

        System.out.println("What's your name? ");
        String customerName = input.nextLine(); // Ask for user input
        String[] name = customerName.split(" "); //Separates first and last name
        System.out.println("How much do you want to play?");//Ask for user input
        double bet = input.nextDouble();
        double prize = bet; // Set prize value to variable
        System.out.println("Great! " + name[0] + " wants to play " + mon.format(bet)); //Output user info
        int[] winning_numbers = {3, 5, 16, 58, 59, 11}; //Assign winning numbers to an array
        System.out.println("Here are the ticket: ");
        for (int i = 0; i < 10; i++) { //Create each ticket
            for (int x = 0; x < 6; x++) {
                int rand_num = (rand.nextInt(99));
                System.out.print(fmt.format(rand_num) + " "); //Assign a random integer to a variable and each ticket number place
                for (int f : winning_numbers) {
                    if (fmt.format(rand_num).equals(fmt.format(f))) {
                        prize = Math.pow(prize, 1.75); //Increases prize for every correct number
                    }
                }
            }
            System.out.println();
        }
        if(prize == bet){
            prize = 0; //Resets winnings if there were no correct numbers
        }
        System.out.println("-----------------");
        System.out.println("Good luck " + name[0] + "!"); //Outputs first name
        System.out.println("-----------------");
        System.out.println("Your Winnings are: ");
        System.out.println(mon.format(prize)); // potential winning prize
        System.out.println("-----------------");
    }
}

