import java.util.*;
import javax.sound.midi.Soundbank;

public class Coins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] lines = new String[3];
        int weightOfA = 0;
        int weightOfB = 0;
        int weightOfC = 0;

        for (int i = 0; i < 3; i++) {
            lines[i] = myScanner.nextLine();
        }

        // determine weight of coins
        for (int i = 0; i < 3; i++) {
            if (lines[i].charAt(1) == '>') {
                if (lines[i].charAt(0) == 'A') {
                    weightOfA += 1;
                } else if (lines[i].charAt(0) == 'B') {
                    weightOfB += 1;
                } else if (lines[i].charAt(0) == 'C') {
                    weightOfC += 1;
                }
                if (lines[i].charAt(2) == 'A') {
                    weightOfA -= 1;
                } else if (lines[i].charAt(2) == 'B') {
                    weightOfB -= 1;
                } else if (lines[i].charAt(2) == 'C') {
                    weightOfC -= 1;
                }
            } else if (lines[i].charAt(1) == '<') {
                if (lines[i].charAt(2) == 'A') {
                    weightOfA += 1;
                } else if (lines[i].charAt(2) == 'B') {
                    weightOfB += 1;
                } else if (lines[i].charAt(2) == 'C') {
                    weightOfC += 1;
                }

                if (lines[i].charAt(0) == 'A') {
                    weightOfA -= 1;
                } else if (lines[i].charAt(0) == 'B') {
                    weightOfB -= 1;
                } else if (lines[i].charAt(0) == 'C') {
                    weightOfC -= 1;
                }
            }
        }

        Map<Character, Integer> coins = Map.of('A', weightOfA, 'B', weightOfB, 'C', weightOfC);
        LinkedHashMap<Character, Integer> sortedCoins = new LinkedHashMap<>();

        // sorting hashmap by value

        coins.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedCoins.put(x.getKey(), x.getValue()));

        if (Math.abs(sortedCoins.entrySet().iterator().next().getValue())
                + Math.abs(sortedCoins.get(sortedCoins.keySet().toArray()[sortedCoins.size() - 1])) != 4) {
            System.out.println("Impossible");
            return;
        }

        String result = "";
        for (Map.Entry<Character, Integer> entry : sortedCoins.entrySet()) {
            result += entry.getKey();
        }

        System.out.println(result);
    }
}