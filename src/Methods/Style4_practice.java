package Methods;

import java.util.Scanner;

public class Style4_practice {
    public static void main (String args[]){
        double length, width, area, perimiter;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length");
        length=scan.nextDouble();
        System.out.println("What is the width");
        width=scan.nextDouble();
        System.out.println("The area of your room is "+getArea(width, length)+" and the perimiter is "+getPerimiter(width, length));
    }
    public static double getArea(double base, double height){
        return base * height;
    }
    public static double getPerimiter(double base, double height){
        return base+base+height+height;
    }
    public static double square(int in){
        return Math.pow(in, 2);
    }
    public static double cube(int in){
        return Math.pow(in, 3);
    }
}
