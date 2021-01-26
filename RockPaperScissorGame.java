package com.MitRao;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class HarryJavaProgramms {
    public static void main(String[] args) {

        //Creating an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        //Creating an instance of Random class
        Random rnd = new Random();

        //scorecard

        short humanPlayerScore = 0;
        short computerPlayerScore = 0;

        System.out.println("JAVA ROCK PAPER SCISSOR GAME");
        System.out.println("-----------------------------");
        System.out.println("PRESS \n 1:ROCK \n 2:PAPER \n 3.SCISSOR");

        System.out.print("Enter how many rounds you wanna play: ");
        int rounds = sc.nextInt();

        //logic for the game
        for(byte i = 1; i<=rounds; i++){

            System.out.println("---------------------");
            System.out.println("\tRound: " + i);
            System.out.println("---------------------");

            System.out.print("YOUR TURN: ");
            int humanPlayerChoice = sc.nextInt();

            int computerPlayerChoice = rnd.nextInt(3) + 1;

            System.out.println("Your choice: " + humanPlayerChoice + " Computers choice: " + computerPlayerChoice);

            if(computerPlayerChoice == humanPlayerChoice){
                humanPlayerScore += 0;
                computerPlayerScore += 0;
            }

            else if(computerPlayerChoice == 1){
                if(humanPlayerChoice == 2){
                    humanPlayerScore += 1;
                }
                else{
                    computerPlayerScore += 1;
                }
            }

            else if(computerPlayerChoice == 2){
                if(humanPlayerChoice == 1){
                    computerPlayerScore += 1;
                }
                else{
                    humanPlayerScore += 1;
                }
            }

            else if(computerPlayerChoice == 3){
                if(humanPlayerChoice == 1){
                    humanPlayerScore += 1;
                }
                else{
                    computerPlayerScore += 1;
                }
            }
        }
        System.out.println("-----------------------");
        System.out.println("Your final score: " + humanPlayerScore + " Computer's final score: " + computerPlayerScore);
        System.out.println("-----------------------");

        if(computerPlayerScore == humanPlayerScore){
            System.out.println("ITS A DRAW ");
        } else if(computerPlayerScore > humanPlayerScore){
            System.out.println("COMPUTER WINS");
        } else{
            System.out.println("YOU WIN");
        }


    }
}
