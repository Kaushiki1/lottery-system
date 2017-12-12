package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        String prompt = "Please enter amount of money: ";
        double amount = getAmount(prompt);


        int lottery = (int) (Math.random() * 100000);
        int NUM_DIGITS = 5;
        int[] guessDigits = new int[NUM_DIGITS];
        Scanner input = new Scanner(System.in);
        int i;
        String welcome = "";
        System.out.println("Welcome to the Lottery Game, Please enter your name");
        welcome = input.next();
        System.out.print("Hello " + welcome.toUpperCase() + " Please enter lottery pick (five digits):" );
        int guess = input.nextInt();


        int sum;
        Scanner scan = new Scanner (System.in);

        for (i = 1; i<= 5; i++)
        {
            System.out.print(" " + i + ": ");
            guessDigits[i-1] = scan.nextInt();
        }

        System.out.println("Guess numbers for lottery");
        System.out.println("--------------------");
        sum = 0;
        for (i = 0; i<guessDigits.length; i++)
        {
            System.out.println("lottery " + i + " number " + guessDigits[i]);
            sum += guessDigits[i];
        }
        System.out.println("\nTotal numbers: " + sum);


        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery / 10;
        int lotteryDigit3 = lottery / 10;
        int lotteryDigit4 = lottery / 10;
        int lotteryDigit5 = lottery % 10;

        /*int guessDigit1 = guess / 10;
        int guessDigit2 = guess / 10;
        int guessDigit3 = guess / 10;
        int guessDigit4 = guess / 10;
        int guessDigit5 = guess % 10;
        */
        System.out.println("The lottery number is " + lottery);


        if (guess == lottery)
            System.out.println("Exact match: You win $100,000 :D");
        else if (guessDigits[4] == lotteryDigit1
                && guessDigits[3] == lotteryDigit2
                && guessDigits[2] == lotteryDigit3
                && guessDigits[1] == lotteryDigit4
                && guessDigits[0] == lotteryDigit5)
            System.out.println("Match all the digits: You win $25,000 :)");
        else if (guessDigits[0] == lotteryDigit1
                || guessDigits[0] == lotteryDigit2
                || guessDigits[0] == lotteryDigit3
                || guessDigits[0] == lotteryDigit4
                || guessDigits[0] == lotteryDigit5
                || guessDigits[1] == lotteryDigit1
                || guessDigits[1] == lotteryDigit2
                || guessDigits[2] == lotteryDigit3
                || guessDigits[2] == lotteryDigit4
                || guessDigits[2] == lotteryDigit5
                || guessDigits[3] == lotteryDigit1
                || guessDigits[3] == lotteryDigit2
                || guessDigits[3] == lotteryDigit3
                || guessDigits[3] == lotteryDigit4
                || guessDigits[3] == lotteryDigit5
                || guessDigits[4] == lotteryDigit1
                || guessDigits[4] == lotteryDigit2
                || guessDigits[4] == lotteryDigit3
                || guessDigits[4] == lotteryDigit4
                || guessDigits[4] == lotteryDigit5)
            System.out.println("Match one digit: you win $1,000");
        else
            for (i = 0; i < 3; i++) {
                System.out.println("Sorry, You lose :(");
            }
    }


    public static double getAmount(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        double amount = input.nextDouble();
        //input.close();
        return amount;
    }

    public static void main(String prompt){
        System.out.println(name("IS Lottery"));
        System.out.println(price(10));
    }
    public static String name(String name){
        return ("Name of this lottery is: " + name);
    }
    public static String price(int price){
        return ("Price of the ticket is: " + "$" + price);
    }
}



