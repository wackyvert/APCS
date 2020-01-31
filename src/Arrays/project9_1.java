package Arrays;

import java.util.Scanner;

public class project9_1 {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int odd_num[] = new int[10];
        int even_num[] = new int[10];
        int neg_num[] = new int[10];


        for (int i=0; i<10;i++){
            System.out.println("Enter in a number");
            int number = num.nextInt();
            if(number < 0){
                neg_num[i]=number;
            }
            else if(number%2!=0){
                odd_num[i]=number;
            }
            else
            {
                even_num[i]=number;
            }

        }
        for(int a:odd_num){
            System.out.println(odd_num[a]);
        }
    }



}
