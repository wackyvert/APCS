package Unit1;

import java.util.Scanner;

public class IfThenPractice {
    public static void main (String args[]){
        Scanner info = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = info.nextInt();
        String state = info.nextLine();
        if (age >= 18 && state.equalsIgnoreCase("Minnesota"))
        {
            System.out.println("You can buy Cigarettes or a Vaping pen but I hope you have good health insurance!");
        }
        else
        {
            System.out.println("Go home you loser!");
        }

    }
}
