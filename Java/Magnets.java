import java.util.*;

public class Magnets {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfMagnets = myScanner.nextInt();
        int[] magnets = new int[numberOfMagnets];
        int groups = 1;
        for (int i = 0; i < numberOfMagnets; i++) {
            magnets[i] = myScanner.nextInt();
        }
        for (int i = 0; i < numberOfMagnets - 1; i++) {
            if (magnets[i] == magnets[i + 1]) {
                continue;
            } else {
                groups++;
            }
        }
        System.out.println(groups);
    }
}