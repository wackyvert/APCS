package Methods;

import java.util.Scanner;

public class style4_3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What numbers do you want squared or cubed?");
        int num = scan.nextInt();
        System.out.println(square(num)+" "+cube(num));
    }
    public static double square(int in){
        return Math.pow(in, 2);
    }
    public static double cube(int in){
        return Math.pow(in, 3);
    }
}
