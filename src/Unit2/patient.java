package Unit2;

public class patient {



    private String fName, lName;
    private double height,weight;
    private int age;
    private int systolic, diastolic;
    private double temp;

    public patient(){
        height = 60;
        weight = 100;
        systolic = 120;
        diastolic = 80;
        temp = 98.6;
        age = 20;
    }
    public patient(String fName, String lName){
        this.fName=fName;
        this.lName=lName;
    }
    public patient (String fName, String lName, double height, double weight, int age, int systolic, int diastolic, double temp){
        this.fName=fName;
        this.lName=lName;
        this.height=height;
        this.weight=weight;
        this.age=age;
        this.systolic=systolic;
        this.diastolic=diastolic;
        this.temp=temp;
    }
    public String toString(){
        return"First Name:\t"+fName+"\nLast Name:\t"+lName+"\n Height:\t"+height+"\nWeight:\t"+weight+"\nAge:\t"+age+"\nSystolic:\t"+systolic+"\nDiastolic:\t"+diastolic+"\nTemp:\t"+temp;
    }
    public void setlName(String newName){
        lName=newName;
    }
}
