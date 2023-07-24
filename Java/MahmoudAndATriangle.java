import java.util.*;

public class MahmoudAndATriangle {

    // it worked !!!!!! :D

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(myScanner.nextInt());
        }

        boolean found = false;
        Collections.sort(a);
        for (int i = 0; i < n - 2; i++) {
            if (a.get(i) + a.get(i + 1) > a.get(i + 2)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}