// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat fmt = new DecimalFormat("#00");
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        System.out.println("Here are the ticket: ");
        for (int i = 0; i < 10 ; i++){
            for(int x = 0; x < 6; x++){
                System.out.print(fmt.format(rand.nextInt(99)) + " ");
            }
            System.out.println();
        }
    }
}
