package Unit2;

public class problem4 {
    public static boolean check(int n) {
        if (n < 100000) {
            String digits = String.valueOf(n);
            if (digits.substring(0).equals(digits.substring(4))) {
                if (digits.substring(1).equals(3)) {
                    return true;

                }
            }
        }
        else if (n>100000){
                String digits = String.valueOf(n);
                if (digits.substring(0).equals(digits.substring(5))) {
                    if (digits.substring(1).equals(4)) {
                        if (digits.substring(2).equals(3)){
                            return true;
                        }

                    }
                }
            }

    return false;
    }

    public static void main(String args[]){
        for (int i=1111; i<998002; i++){
            if (check(i)){
                System.out.println("Palindrome: "+i);
            }

        }
    }
}
