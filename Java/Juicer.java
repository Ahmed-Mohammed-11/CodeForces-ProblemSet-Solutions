import java.util.Arrays;
import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfOranges = myScanner.nextInt();
        int sizeLimit = myScanner.nextInt();
        int d = myScanner.nextInt();
        int waste = 0;
        int wipeOuts = 0;
        int[] oranges = new int[numberOfOranges];
        for (int i = 0; i < numberOfOranges; i++) {
            oranges[i] = myScanner.nextInt();
        }

        for (int i = 0; i < numberOfOranges; i++) {
            if (oranges[i] > sizeLimit) {
                continue;
            } else {
                waste += oranges[i];
            }
            if (waste > d) {
                waste = 0;
                wipeOuts++;
            }
        }
        System.out.println(wipeOuts);
    }
}