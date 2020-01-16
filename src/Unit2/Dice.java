package Unit2;

import java.util.Random;

public class Dice {
    int sides=6;
    int money;

    public Dice(){

    }

    public Dice(int sides){
        this.sides=sides;
    }
    public int roll(){

        Random roll = new Random();
        int numRolled = roll.nextInt(sides);
        return numRolled;
    }
    public void changeNumOfSides(int input){
        sides = input;
    }
    public void initGame(){}
}
