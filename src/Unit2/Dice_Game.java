package Unit2;

import java.util.Scanner;

public class Dice_Game {
    static Scanner scan = new Scanner(System.in);
    static int startingMoney;
    static int betMoney;
    static String choice;

    public static void main(String args[]) {
        boolean status = true;
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        System.out.println("How much money do you want to start with?");
        startingMoney = scan.nextInt();
        while (status) {
            System.out.println("How much do you want to bet on this roll? If you wish to stop, please type \"0\".");
            betMoney=scan.nextInt();
            if (betMoney > 0) {
                if(betMoney>startingMoney){
                    System.out.println("You cant bet that much! Try again.");
                    continue;
                }
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();
            if (roll1 == roll2 || roll1 + roll2 == 7 || roll1 + roll2 == 11) {
                startingMoney = startingMoney +(betMoney * 2);

                System.out.println("Congrats, you managed to win something! Balance: " + startingMoney+"\nYou rolled: "+roll1+" "+roll2);
            } else {
                startingMoney-=betMoney;
                System.out.println("You lost. Sorry. You rolled: " + roll1 + " " + roll2+"\nYour balance is: "+startingMoney);

                    }
            if(startingMoney==0){System.out.println("Sorry, you ran out. See you later!");
            break;
            }

            else if(betMoney==0){status=false;}
            }
        }
    }}

