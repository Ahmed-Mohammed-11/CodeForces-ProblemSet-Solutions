
import java.util.*;
import java.io.*;

public class VanyaAndFence {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    int friendsNom = myScanner.nextInt();
    int fenceHeight = myScanner.nextInt();
    ArrayList<Integer> heights = new ArrayList<>();
    int width = 0;
    for (int i = 0; i < friendsNom; i++) {
      heights.add(myScanner.nextInt());
    }

    for (int i = 0; i < friendsNom; i++) {
      if (heights.get(i) > fenceHeight) {
        width += 2;
      } else {
        width += 1;
      }
    }
    System.out.println(width);
  }
}