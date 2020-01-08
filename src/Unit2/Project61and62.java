package Unit2;

import java.util.Random;
import java.util.Scanner;

public class Project61and62 {
    public static void main(String args[]) {


        //create 5 random numbers between o and 500
        Random num_gen = new Random();
        Scanner input = new Scanner(System.in);
        boolean guess = false;
        int number = num_gen.nextInt(101);
        while (guess == false) {
            System.out.println("Guess a number between 0 and 100");
            double userIn = input.nextDouble();
            if (userIn > number) {
                System.out.println("Sorry, that number is too high! Try again...");
            } else if (userIn < number) {
                System.out.println("Sorry, that number is too low! Try again...");
            } else {
                guess = true;
                System.out.println("Good job!");
            }
        }

    }


}
