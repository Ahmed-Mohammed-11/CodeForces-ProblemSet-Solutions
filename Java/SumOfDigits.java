import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String number = myScanner.next();
        int steps = 0;
        long sumOfDigits = 0;

        // to remove leading zeros so that the program knows the real number
        if (number.charAt(0) == '0') {
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) != '0') {
                    number = number.substring(i);
                    break;
                }
            }
        }


        //after removing leading zeros, if the number is 1 digit long, the answer is 0
        if (number.length() == 1 || number.equals("0")) {
            System.out.println(0);
            return;
        }

        do {
            sumOfDigits = 0;
            for (int i = 0; i < number.length(); i++) {
                sumOfDigits += Long.valueOf(number.charAt(i) + "");
            }
            number = sumOfDigits + "";
            steps++;
        } while (sumOfDigits > 9);

        System.out.println(steps);
    }
}