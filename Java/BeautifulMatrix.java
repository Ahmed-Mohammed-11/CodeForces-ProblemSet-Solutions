import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = myScanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(Math.abs(row - 3) + Math.abs(column - 3));
    }
}
