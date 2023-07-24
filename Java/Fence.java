import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int numberOfPlanks = myScanner.nextInt();
        int widthOfTheHole = myScanner.nextInt();
        int[] heightsOfPlanks = new int[numberOfPlanks];

        for (int i = 0; i < numberOfPlanks; i++) {
            heightsOfPlanks[i] = myScanner.nextInt();
        }

        int minimum = 0;
        for (int i = 0; i < widthOfTheHole; i++) {
            minimum += heightsOfPlanks[i];
        }

        int startingIndex = 0;
        int currentSum = minimum;

        for (int i = 1; i < numberOfPlanks - widthOfTheHole + 1; i++) {
            currentSum = currentSum - heightsOfPlanks[i - 1] + heightsOfPlanks[i + widthOfTheHole - 1];
            // System.out.println(currentSum);
            if (currentSum < minimum) {
                minimum = currentSum;
                startingIndex = i;
            }
        }

        System.out.println(startingIndex + 1);

    }
}