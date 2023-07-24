import java.util.*;

public class ChatOnline {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int p = myScanner.nextInt();
        int q = myScanner.nextInt();
        int l = myScanner.nextInt();
        int r = myScanner.nextInt();
        int[] a = new int[p];
        int[] b = new int[p];
        int[] c = new int[q];
        int[] d = new int[q];
        for (int i = 0; i < p; i++) {
            a[i] = myScanner.nextInt();
            b[i] = myScanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            c[i] = myScanner.nextInt();
            d[i] = myScanner.nextInt();
        }

        boolean found = false;
        int counter = 0;

        for (int i = l; i <= r; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++) {
                    if ((c[j] + i >= a[k] && c[j] + i <= b[k]) || (d[j] + i >= a[k] && d[j] + i <= b[k])
                            || (c[j] + i <= a[k] && d[j] + i >= b[k])) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    counter++;
                    found = false;
                    break;
                }
            }
        }

        System.out.println(counter);

    }
}
