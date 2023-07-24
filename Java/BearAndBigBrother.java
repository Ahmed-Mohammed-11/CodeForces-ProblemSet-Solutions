
import java.util.*;
import java.io.*;

public class BearAndBigBrother {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int limakWeight = myScanner.nextInt();
        int bobWeight = myScanner.nextInt();
        int years = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            years++;
        }
        System.out.println(years);
    }
}