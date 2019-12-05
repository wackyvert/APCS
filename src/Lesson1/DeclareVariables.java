package Lesson1;

public class DeclareVariables {
    public static void main(String args[]){
        String name = "Jake";
        int age = 15;
        System.out.println("Jake" + "Ronald" + "Torgerson");
        printUpperCase(name);
    }
    public static void printLowerCase(String input)
    {
       input = input.toLowerCase();
       System.out.println(input);
    }
    public static void printUpperCase(String input)
    {
        input = input.toUpperCase();
        System.out.println(input);
    }
}
