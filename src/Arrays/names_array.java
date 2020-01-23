package Arrays;

import java.util.Scanner;

public class names_array {
    public static void main(String args[]){


        String[] names = new String[8];
        names[0]="Bob";
        names[1]="John";
        names[2]="Mary";
        for(int i=0;i< names.length; i++) {
            System.out.println("Enter in "+(i+1)+" name");
            Scanner scanner = new Scanner(System.in);
            names[i]=scanner.nextLine();
        }
        }




}
