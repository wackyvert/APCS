package Unit2;

import java.util.Scanner;

public class For_Loop {
    public static void main(String args[])
    {
        Scanner info = new Scanner(System.in);
        System.out.println("What is the starting value of American Dollars? ");
        int dollars= info.nextInt();
        System.out.println("What dollar amount do you want to convert to? ");
        int stop_value = info.nextInt();
        System.out.println("What amount do you want to increase your dollars by each time? ");
        int increase = info.nextInt();
        for (int x=dollars; x<=stop_value; x+=increase){
            
        }
    }
}
