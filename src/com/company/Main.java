package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("1. Start Game \n2. Exit");
            System.out.print("Enter Your Choice : ");
            int ch = takeIntegerInput(2);
            int nextRound = 1;
            int noOfRounds = 0;

            if (ch == 1) {
                while (nextRound == 1) {
                    game ob = new game();
                    boolean isMatched = false;
                    boolean isLimitCrossed = false;
                    System.out.println("\nRound " + ++noOfRounds + " starts...");

                    while (!isMatched && !isLimitCrossed) {
                        isLimitCrossed = ob.input();
                        isMatched = ob.isCorrectGuess();
                    }
                    System.out.println("1. Next Round \n2. Exit");
                    System.out.print("Enter Your Choice : ");
                    nextRound = takeIntegerInput(2);
                    if (nextRound != 1)
                        System.exit(0);
                }
            } else
                System.exit(0);
        }
    }

    public static int takeIntegerInput(int bound) {
        int input = 0;
        boolean flag = false;

        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;

                if (flag && input > bound || input < 1) {
                    System.out.println("Choose a Number Between 1 to " + bound);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Enter Integer Values Only!!");
                flag = false;
            }
        }
        return input;
    }
}
