package Unit2;

import java.util.Scanner;

public class Dice_Game {
   static Scanner scan = new Scanner(System.in);
   static int startingMoney;
   static boolean status = true;
   static int betMoney;
    public static void main(String args[]){
    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);
    System.out.println("How much money do you want to start with?");
    startingMoney = scan.nextInt();
    while (status){
        System.out.println("How much do you want to bet on this roll?");
        betMoney = scan.nextInt();
        int roll1 = dice1.roll();
        int roll2 = dice2.roll();
        if (roll1==roll2 || roll1+roll2==7 || roll1+roll2==11)
        {
            startingMoney=+betMoney*2;
            System.out.println("Congrats, you managed to win something! Balance: "+startingMoney);
        }
        else{
            System.out.println("You lost. Sorry. You rolled: "+roll1+" "+roll2);
        }
        if (startingMoney>0){
            System.out.println("Do you want to play again?");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("yes")){
                status=true;
            }
            else status=false;
        }
    }
    }
}
