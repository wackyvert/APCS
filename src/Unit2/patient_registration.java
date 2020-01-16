package Unit2;

import java.util.Scanner;

public class patient_registration {

    public static void main(String [] args){
        Scanner info = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        patient jrt_01132004= new patient("Jake", "Torgerson", 71.2,  10, 10, 10, 10, 96.9);
        jrt_01132004.setlName("Ramey");
        System.out.println(jrt_01132004.toString());

    }

}
