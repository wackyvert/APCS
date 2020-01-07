package Unit2;

import java.util.Scanner;

public class while_loop {
    public static void main(String args[]){

        boolean correct = true;
        Scanner info = new Scanner(System.in);
double bank_acct=500;
        while (correct){
            System.out.println("Enter the number you want to square");
            System.out.println("If you want to exit the program, enter the number \"0\"");
            double square = info.nextDouble();
            if (square == 0){
                correct=false;
            }
            else{
                System.out.println(Math.pow(square, 2));
            }
        }
        do{

            System.out.println("Enter the price to check and see if item is greater than the amount in the bank_acct");
            double item = info.nextDouble();
            if(item==0){
                break;
            }
            bank_acct-=item;
            System.out.println("You have $"+bank_acct+" left in your account.");
        }
        while ( bank_acct >0);
    }

}
