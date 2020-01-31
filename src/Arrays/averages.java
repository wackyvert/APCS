package Arrays;

import java.util.Scanner;

public class averages {
    static double[] numbers;
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        numbers = new double[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter a number...");
            numbers[i]=num.nextDouble();

        }
        System.out.println(getAverage(numbers));
    }
    public static double getAverage(double[] n){
        double sum=0;
        for(int i=0; i<n.length; i++){
            sum+=n[i];
        }
        return sum/n.length;
    }
    /*public static double[] numAboveAverage(int length){
        for(int i=0; i<length; i++){
            if (numbers[i]>getAverage(numbers)){

            }
        }
    }*/
}
