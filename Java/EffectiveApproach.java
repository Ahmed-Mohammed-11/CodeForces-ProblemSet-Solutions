import java.io.*;
import java.util.*;

public class EffectiveApproach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100005];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] left = new int[100005];
        int[] right = new int[1000005];
        for (int i = 0; i < n; i++) {
            left[a[i]] = i + 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            right[a[i]] = n - i;
        }

        int m = scanner.nextInt();

        long ansLeft = 0;
        long ansRight = 0;
        while (m-- > 0) {
            int x = scanner.nextInt();
            ansLeft += left[x];
            ansRight += right[x];
        }
        System.out.println(ansLeft + " " + ansRight);
    }
}

// time complexity is high here

// public static int Vasya(int[] elements, int[] queries) {
// int counterOfVasya = 0;
// for (int i = 0; i < queries.length; i++) {
// for (int j = 0; j < elements.length; j++) {
// if (elements[j] == queries[i]) {
// counterOfVasya++;
// break;
// } else {
// counterOfVasya++;
// }
// }
// }
// return counterOfVasya;
// }

// public static int Petya(int[] elements, int[] queries) {
// int counterOfPetya = 0;
// for (int i = 0; i < queries.length; i++) {
// for (int j = elements.length - 1; j >= 0; j--) {
// if (elements[j] == queries[i]) {
// counterOfPetya++;
// break;
// } else {
// counterOfPetya++;
// }
// }
// }
// return counterOfPetya;
// }

// public static void main(String[] args) throws IOException {

// Scanner inpuScanner = new Scanner(System.in);

// // take array elements

// int numberOfElements = inpuScanner.nextInt();
// int[] elements = new int[numberOfElements];

// for (int i = 0; i < numberOfElements; i++) {
// elements[i] = inpuScanner.nextInt();
// }

// // take queries

// int numberOfQueries = inpuScanner.nextInt();
// int[] queries = new int[numberOfQueries];

// for (int i = 0; i < numberOfQueries; i++) {
// queries[i] = inpuScanner.nextInt();
// }

// System.out.print(Vasya(elements, queries) + " ");
// System.out.println(Petya(elements, queries));

// }
