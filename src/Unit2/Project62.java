package Unit2;

import java.util.Random;
import java.util.Scanner;

public class Project62 {
    public static int userIN;
    public static boolean checkGuess;
    public static int compRandom;
    public static int guessNum=0;
    public static int max = 100;
    public static int min = 1;
    public static void main(String args[]) {


        System.out.println("Enter a number between 1 and 100 for the computer to guess");

        Scanner input = new Scanner(System.in);
        userIN = input.nextInt();
        while (compRandom != userIN && guessNum <=6){
            compRandom = randomInBounds();
            System.out.println("Number guessed: "+compRandom);
            System.out.println("Was it higher or lower?");
        String b = input.nextLine();
        if(b.equalsIgnoreCase("higher")){
            min=compRandom;
        }
        else{max=compRandom;}
        guessNum++;
        }
        if(compRandom==userIN) {
            System.out.println("Number guessed correctly! Your number was: " + compRandom);
        }
        else if (guessNum>6){
            System.out.println("You win!");
        }
    }
        public static int randomInBounds(){
        Random generate = new Random();
        int num = generate.nextInt(max) + min;
        return num;
        }

}
