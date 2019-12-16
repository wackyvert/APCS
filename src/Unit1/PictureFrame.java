package Unit1;

import javafx.scene.control.TextInputDialog;

import java.util.Optional;
import java.util.Scanner;

public class PictureFrame {

    static double totalCost;
    static double paintCost;
    static double glassCost;
    static double cardBoardCost;
    static double frameCost;
    static double surfaceArea;
    static String color;
    static boolean white;
    static boolean fancy;
    static boolean crowns;
    static Scanner widthInput = new Scanner(System.in);
    static Scanner heightInput = new Scanner(System.in);
    static Scanner colorInput = new Scanner(System.in);
    static Scanner fancyInput = new Scanner(System.in);
    static Scanner cronws = new Scanner(System.in);
    public static double getTotalCost(){
        totalCost = paintCost+glassCost+cardBoardCost+frameCost;
        return totalCost;
    }
    public static double getSA(){
        System.out.println("What is the width?");
        double width = widthInput.nextDouble();
        System.out.println("What is the height?");
        double height = heightInput.nextDouble();
        surfaceArea= height*width;
        return height * width;
    }
    public static String getPaint(){
        System.out.println("What color?");
        color = colorInput.nextLine();
        if (color.equalsIgnoreCase("white"))
        {
            white = true;
        }
        else
        {
            white = false;
            paintCost = surfaceArea * .1;
        }
        return color;
    }
    public static boolean getFancy(){
        System.out.println("Do you want the frame to be fancy?");
        String fancyIn = fancyInput.nextLine();
        if (fancyIn.equalsIgnoreCase("yes"))
        {
            fancy = true;
        }
        else
        {
            fancy=false;
        }
        return fancy;

    }
    public static boolean getCrowns(){
        System.out.println("Do you want crowns?");
        String crownIn = cronws.nextLine();
        if(crownIn.equalsIgnoreCase("yes")){
            crowns = true;
        }
        return crowns;
    }
    public static void main(String[] args){
        surfaceArea = getSA();
        String paint = getPaint();
        if (white==false){
            paintCost = .10*surfaceArea;
        }
        getCrowns();
        if(crowns==true){
            totalCost=+1;
        }
        getFancy();
        System.out.println("Total cost: $" + getTotalCost());

    }




}
