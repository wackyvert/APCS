package Unit2;

import com.sun.source.tree.ClassTree;

public class Students {

    private String firstName;
    private String lastName;
    private int credits;
    private double gpa;
    private int test1;
    private int test2;
    private int test3;


    public Students(String firstName, String lastName, int credits, double gpa){
        this.firstName=firstName;
        this.lastName=lastName;
        this.credits=credits;
        this.gpa=gpa;
    }
    public Students(String firstName, String lastName, int test1, int test2, int test3)
    {
     this.firstName = firstName;
     this.lastName=lastName;
     this.test1=test1;
     this.test2=test2;
     this.test3=test3;
    }

    public String toString(String string) {
        return
    }

    public String getName(){
        return firstName+" "+lastName;
    }
    public double getGPA(){
        return gpa;
    }
    public int getCredits(){
        return credits;
    }
}
