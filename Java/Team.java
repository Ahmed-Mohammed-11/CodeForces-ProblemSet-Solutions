import java.util.Scanner;

public class Team{
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        int numberOfProblems = myScanner.nextInt();
        int tmp = numberOfProblems;
        for(int j = 0; j < tmp ; j++){
            int sure = 0;
            for(int i = 0; i < 3; i++){
                if(myScanner.nextInt() == 1){
                    sure++;
                }
            }
            if(sure < 2){
                numberOfProblems--;
            }
        }
        System.out.println(numberOfProblems);
    }
}