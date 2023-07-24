import java.util.*;
import java.io.*;

public class BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int cities = myScanner.nextInt();
        int limakPosition = myScanner.nextInt() - 1;
        int[] criminals = new int[cities];
        int[] toCatch = new int[cities];
        int beforeLimak = 0;
        int afterLimak = 0;
        int total = 0;

        for (int i = 0; i < cities; i++) {
            criminals[i] = myScanner.nextInt();
            if (i < limakPosition) {
                beforeLimak++;
            } else if (i > limakPosition) {
                afterLimak++;
            }
        }

        for (int counter = 0; counter < criminals.length; counter++) {
            if (criminals[counter] == 1) {
                toCatch[Math.abs(limakPosition - counter)]++;
            }
        }

        if (toCatch[0] == 1) {
            total++;
        }

        for (int i = 0; i < toCatch.length; i++) {
            if (toCatch[i] == 2) {
                total += 2;
            }

            if (toCatch[i] == 1) {
                if ((i > afterLimak && i <= beforeLimak) || (i > beforeLimak && i <= afterLimak)) {
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
