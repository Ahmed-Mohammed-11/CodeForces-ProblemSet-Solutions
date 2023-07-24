import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        int t = myscanner.nextInt();
        int k = myscanner.nextInt();
        int d = myscanner.nextInt();
        // time taken with one oven
        int rounds1 = n / k + ((n % k != 0) ? 1 : 0);
        int time1 = rounds1 * t;
        // time taken with 2 ovens
        int stream1 = 0;
        int stream2 = d;
        int production = 0;
        while (production < n) {
            if (stream1 <= stream2) {stream1 += t;}
            else {stream2 += t;}
            production += k;
        }
        int time2 = (stream1 >= stream2) ? stream1 : stream2;
        System.out.println((time1 <= time2) ? "NO" : "YES");

    }
}