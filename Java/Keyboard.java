import java.util.*;
import java.awt.Point;

public class Keyboard {

    public static double ecledianDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static boolean containsUpperCase(String inputLetters) {
        for (int i = 0; i < inputLetters.length(); i++) {
            if (Character.isUpperCase(inputLetters.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int lines = myScanner.nextInt();
        int letters = myScanner.nextInt();
        int allowedDistance = myScanner.nextInt();
        char[][] keyboard = new char[lines][letters];
        ArrayList<Integer> shiftKeysX = new ArrayList<>();
        ArrayList<Integer> shiftKeysY = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String line = myScanner.next();
            for (int j = 0; j < letters; j++) {
                if (line.charAt(j) == 'S') {
                    shiftKeysX.add(i);
                    shiftKeysY.add(j);
                }
                keyboard[i][j] = line.charAt(j);
            }
        }

        int inputLettersCount = myScanner.nextInt();
        String inputLetters = myScanner.next();
        String inputLettersLowerCase = inputLetters.toLowerCase();

        // check if there is an uppercase letter and no shift key
        if (shiftKeysX.isEmpty() && containsUpperCase(inputLetters)) {
            System.out.println("-1");
            return;
        }

        String keyboardString = "";
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < letters; j++) {
                keyboardString += keyboard[i][j];
            }
        }

        // check if there is a letter that is not on the keyboard
        for (int i = 0; i < inputLettersCount; i++) {
            if (!(keyboardString.contains(inputLettersLowerCase.charAt(i) + ""))) {
                System.out.println("-1");
                return;
            }
        }

        // check how many times we need to use the other hand
        Map<Point, Character> map = new HashMap<>();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < letters; j++) {
                map.put(new Point(i, j), keyboard[i][j]);
            }
        }

        ArrayList<Character> obstacles = new ArrayList<>();

        for (Map.Entry<Point, Character> entry : map.entrySet()) {
            int count = 0;
            for (int j = 0; j < shiftKeysX.size(); j++) {
                if (entry.getValue() != 'S' && ecledianDistance(entry.getKey().x, entry.getKey().y, shiftKeysX.get(j),
                        shiftKeysY.get(j)) > allowedDistance) {
                    count++;
                }
            }
            if (count == shiftKeysX.size()) {
                obstacles.add(entry.getValue());
            }
        }

        // make obstacles unique
        Set<Character> uniqueObstacles = new HashSet<>();
        uniqueObstacles.addAll(obstacles);
        obstacles.clear();
        obstacles.addAll(uniqueObstacles);

        System.out.println(obstacles);

        int timesToUseOtherHand = 0;
        // for(int i = 0 ; i < inputLettersCount ; i++){
        // for(int j = 0 ; j < uniqueObstacles.size() ; j++){
        // if((inputLetters.charAt(i)+ "").equals((uniqueObstacles.get(j) +
        // "").toUpperCase())){
        // timesToUseOtherHand ++ ;
        // }
        // }
        // }

        System.out.println(timesToUseOtherHand);
    }
}