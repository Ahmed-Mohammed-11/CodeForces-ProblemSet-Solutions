import java.util.*;

public class Word {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount <= lowerCaseCount) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }
    }
}