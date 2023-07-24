import java.util.*;

public class PetyaAndStrings {

    public static int compareStringsLxq(String first, String second) {
        if (first.equalsIgnoreCase(second)) { // or firstString.compareToIgnoreCase(secondString) == 0
            return 0;
        } else if (first.compareToIgnoreCase(second) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        String firstString = myScanner.nextLine();
        String secondString = myScanner.nextLine();
        int result = PetyaAndStrings.compareStringsLxq(firstString, secondString);
        System.out.println(result);
    }
}