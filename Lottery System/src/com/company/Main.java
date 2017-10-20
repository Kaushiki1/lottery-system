package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int lottery= (int)(Math.random()*100000);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lottery pick (five digits):");
        int guess = input.nextInt();

        int lotteryDigit1= lottery / 10;
        int lotteryDigit2= lottery / 10;
        int lotteryDigit3= lottery / 10;
        int lotteryDigit4= lottery / 10;
        int lotteryDigit5= lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess / 10;
        int guessDigit3 = guess / 10;
        int guessDigit4 = guess / 10;
        int guessDigit5 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: You win $100,000 :D");
        else if (guessDigit5 == lotteryDigit1
             &&  guessDigit4 == lotteryDigit2
             &&  guessDigit3 == lotteryDigit3
             &&  guessDigit2 == lotteryDigit4
             &&  guessDigit1 == lotteryDigit5)
            System.out.println("Match all the digits: You win $25,000 :)");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit1 == lotteryDigit4
                || guessDigit1 == lotteryDigit5
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit3 == lotteryDigit3
                || guessDigit3 == lotteryDigit4
                || guessDigit3 == lotteryDigit5
                || guessDigit4 == lotteryDigit1
                || guessDigit4 == lotteryDigit2
                || guessDigit4 == lotteryDigit3
                || guessDigit4 == lotteryDigit4
                || guessDigit4 == lotteryDigit5
                || guessDigit5 == lotteryDigit1
                || guessDigit5 == lotteryDigit2
                || guessDigit5 == lotteryDigit3
                || guessDigit5 == lotteryDigit4
                || guessDigit5 == lotteryDigit5)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, You lose :(");








    }
}
