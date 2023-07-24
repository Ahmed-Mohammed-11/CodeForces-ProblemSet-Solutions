import java.util.Arrays;
import java.util.Scanner;

public class LaunchOfCollider {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int nOfParticles = myScanner.nextInt();
        String movSequence = myScanner.next();
        int[] positions = new int[nOfParticles];
        for (int i = 0; i < nOfParticles; i++) {
            positions[i] = myScanner.nextInt();
        }
        int minTime = Integer.MAX_VALUE;
        int collidingMoment = -1;
        for (int i = 0; i < nOfParticles - 1; i++) {
            if (movSequence.charAt(i) == 'R' && movSequence.charAt(i + 1) == 'L') {
                collidingMoment = positions[i + 1] - (positions[i] + positions[i + 1]) / 2;
                minTime = (collidingMoment < minTime && collidingMoment > 0) ? collidingMoment : minTime;
            }
        }
        System.out.println((minTime == Integer.MAX_VALUE) ? -1 : minTime);
    }
}