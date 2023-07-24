import java.util.*;
import java.io.*;

public class AntonAndDanik {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfGames = myScanner.nextInt();
        String games = myScanner.next();
        int anton = 0;
        int danik = 0;
        for (int i = 0; i < numberOfGames; i++) {
            if (games.charAt(i) == 'A') {
                anton++;
            } else if (games.charAt(i) == 'D') {
                danik++;
            }
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}