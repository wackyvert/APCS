package Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class nineTwo {
    public static void main(String[] args) {
        DecimalFormat nf = new DecimalFormat("#.00");

        Scanner s = new Scanner(System.in);
        float nums[] = new float[10];
        float sum = 0;

        System.out.println("Enter the numbers you want in your array:");
        for (int i = 0; i < 10; i++) {
            nums[i] = s.nextFloat();
            sum = sum + nums[i];
        }

        float average = sum / nums.length;
        System.out.println("The average is: " + nf.format(average));

        System.out.println("The numbers greater than the average are: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                System.out.println(nf.format((nums[i])));
            }

        }
    }
}
