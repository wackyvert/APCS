package Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class nineOne {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int odd_num[] = new int[20];
        int odd_count = 0, even_count = 0, neg_count = 0;
        int even_num[] = new int[20];
        int neg_num[] = new int[20];
        for (int i = 0; i < neg_num.length; i++) {
            System.out.println("Enter a number");
            int number = num.nextInt();
            if (number < 0) {
                neg_num[i] = number;
                neg_count++;
                i++;
            } else if (number % 2 != 0) {
                odd_num[i] = number;
                odd_count++;
                i++;
            } else {
                even_num[i] = number;
                even_count++;
                i++;
            }
        }
        System.out.println("The odd numbers:");
        for (int odd : odd_num) {
            if (odd != 0) {
                System.out.println(odd);
            }

        }
        System.out.println("The even numbers:");
        for (int even : even_num) {
            if (even != 0) {
                System.out.println(even);
            }
        }
        System.out.println("The negative numbers:");
        for (int neg : neg_num) {
            if (neg != 0) {
                System.out.println(neg);
            }

        }

    }
}
