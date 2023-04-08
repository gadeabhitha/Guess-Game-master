package com.company;
import java.util.*;
public class game {
    int number, ip, guess = 0;

    game() {
        Random r = new Random();
        this.number = r.nextInt(100) + 1;
    }

    public boolean input() {
        if (guess < 10) {
            System.out.println("Take a guess : ");
            this.ip = Main.takeIntegerInput(100);
            guess++;
            return false;
        } else {
            System.out.println("Number of Attempts Over!!");
            System.out.println("Number was : "+number);
            return true;
        }
    }

    public boolean isCorrectGuess() {
        if (ip == number) {
            System.out.println("CONGRATULATIONS, You Guessed The Number Correctly " + number + " in " + guess + " guesses");
            switch (guess) {
                case 1:
                    System.out.println("Your Score : 100");
                    break;
                case 2:
                    System.out.println("Your Score : 90");
                    break;
                case 3:
                    System.out.println("Your Score : 80");
                    break;
                case 4:
                    System.out.println("Your Score : 70");
                    break;
                case 5:
                    System.out.println("Your Score : 60");
                    break;
                case 6:
                    System.out.println("Your Score : 50");
                    break;
                case 7:
                    System.out.println("Your Score : 40");
                    break;
                case 8:
                    System.out.println("Your Score : 30");
                    break;
                case 9:
                    System.out.println("Your Score : 20");
                    break;
                case 10:
                    System.out.println("Your Score : 10");
                    break;
            }
            System.out.println();
            return true;
        } else if (guess < 10 && ip > number) {
            if (ip - number > 10) {
                System.out.println("You are guessing Too High");
            } else {
                System.out.println("Guess Little Lower");
            }
        } else if (guess < 10 && ip < number) {
            if (ip - number > 10) {
                System.out.println("You are guessing Too Low");
            } else {
                System.out.println("Guess Little Higher");
            }
        }
        return false;
    }
}

