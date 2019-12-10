package Unit1;

import java.util.Scanner;

public class AssignGrade {
    public static void main(String args[]){
        Scanner info = new Scanner(System.in);
        System.out.println("What is your percentage grade - enter a whole number");
        String grade = "";
        int percent = info.nextInt();
        if (percent >=90)
        {grade = "A";}
        else if (percent >=80)
        {grade = "B";}
        else if (percent >=70)
        {grade = "C";}
        else if (percent >= 60)
        {grade = "D";}
        else if (percent<60)
        {grade = "F";}
        System.out.println(grade);


    }
}
