package Arrays;

import java.util.Scanner;

public class candy_bar_arrau {
    public static void main(String args[]){
        String[] candy = new String[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in your favorite candy bars");
        for(int i=0;i<candy.length;i++) {
        System.out.println("Enter in "+(i+1)+" on the list");
        candy[i]=scan.nextLine();
        }
        for(int i=0; i<candy.length; i++){
            System.out.println(candy[i]);
        }

    }
}
