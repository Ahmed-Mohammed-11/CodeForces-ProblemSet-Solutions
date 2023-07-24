import java.util.Scanner;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int regions = myScanner.nextInt();
        int[] heights = new int[regions];
        int waterSource = 0;
        int[] wateredSections = new int[regions]; // with respect to different sources
        int tmp = 0;

        for (int i = 0; i < regions; i++) {
            heights[i] = myScanner.nextInt();
        }

        myScanner.close();

        // to checkes watered sections before the source

        for (int i = 0; i < regions; i++) {
            waterSource = i;
            tmp = i;
            wateredSections[waterSource]++;
            while ((tmp > 0) && (heights[tmp] >= heights[tmp - 1])) {
                wateredSections[waterSource]++;
                tmp--;
            }
        }

        for (int i = 0; i < regions; i++) {
            waterSource = i;
            tmp = i;
            while ((tmp < (regions - 1)) && (heights[tmp] >= heights[tmp + 1])) {
                wateredSections[waterSource]++;
                tmp++;
            }
        }

        int maximal = 0;
        for (int i = 0; i < regions; i++) {
            if (wateredSections[i] > maximal) {
                maximal = wateredSections[i];
            }
        }

        System.out.println(maximal);
    }
}

// another solution copilot found
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] heights = new int[n];
// int[] lengths = new int[n];
// int max = 0;
// for (int i = 0; i < n; i++) {
// heights[i] = sc.nextInt();
// }
// for (int i = 0; i < n; i++) {
// int length = 1;
// for (int j = i - 1; j >= 0; j--) {
// if (heights[j] <= heights[j + 1]) {
// length++;
// } else {
// break;
// }
// }
// for (int j = i + 1; j < n; j++) {
// if (heights[j] <= heights[j - 1]) {
// length++;
// } else {
// break;
// }
// }
// lengths[i] = length;
// if (length > max) {
// max = length;
// }
// }
// System.out.println(max);
