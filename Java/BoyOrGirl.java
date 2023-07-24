import java.util.*;

public class BoyOrGirl {
    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in);
        String userName = myScanner.nextLine();
        int userNameLen = userName.length();
        String uniqUserName = "";
        for (int i = 0; i < userNameLen; i++) {
            if (uniqUserName.contains((userName.charAt(i) + ""))) {
                continue;
            }
            uniqUserName += userName.charAt(i);
        }
        int uniqUserNameLen = uniqUserName.length();
        if (uniqUserNameLen % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}