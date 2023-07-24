
import java.util.*;

public class GravityFlip {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfColumns = myScanner.nextInt();
        int[] columnsGravity = new int[numberOfColumns];
        for (int i = 0; i < numberOfColumns; i++) {
            columnsGravity[i] = myScanner.nextInt();
        }
        Arrays.sort(columnsGravity);
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print(columnsGravity[i] + " ");
        }
    }
}