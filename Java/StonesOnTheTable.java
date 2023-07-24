import java.util.*;
import java.io.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// another solution

// public static boolean isNeighbour(List<String> stones, int i) {
// if (i == stones.size() - 1)
// return false;
// if (stones.get(i).equals(stones.get(i + 1))) {
// return true;
// }
// return false;
// }

// public static void main(String[] args) {
// Scanner mine = new Scanner(System.in);
// ArrayList<String> stones = new ArrayList<>();
// int n = mine.nextInt();
// String input = mine.next();
// int minimumMoves = 0;
// for (int i = 0; i < n; i++) {
// stones.add(input.substring(i, i + 1));
// }

// for (int i = 0; i < stones.size(); i++) {
// while (isNeighbour(stones, i)) {
// stones.remove(i);
// minimumMoves++;
// }
// }
// System.out.println(minimumMoves);
// mine.close();
// }