package Unit2;

import java.util.Random;
import java.util.Scanner;

public class Project62 {
    public static int userIN;
    public static boolean checkGuess;
    public static int compRandom;
    public static void main(String args[]) {


        System.out.println("Enter a number between 1 and 100 for the computer to guess");

        Scanner input = new Scanner(System.in);
        userIN = input.nextInt();
        long startTime = System.nanoTime();
        while (compRandom != userIN){
            compRandom = randomInBounds();
        System.out.println("Number guessed: "+compRandom);
        }
        System.out.println("Number guessed correctly! Your number was: " +compRandom);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/100000000;
        System.out.println("Number successfuly guessed in "+duration+" seconds");
    }
        public static int randomInBounds(){
        Random generate = new Random();
        int num = generate.nextInt(101);
        return num;
        }

}
