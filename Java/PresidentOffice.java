import java.util.*;

public class PresidentOffice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int officeLength = myScanner.nextInt();
        int officeWidth = myScanner.nextInt();
        char[][] office = new char[officeLength][officeWidth];
        ArrayList<Integer> pOfficeLength = new ArrayList<Integer>();
        ArrayList<Integer> pOfficeWidth = new ArrayList<Integer>();
        char pDeskColor = myScanner.next().charAt(0);
        for (int i = 0; i < officeLength; i++) {
            String row = myScanner.next();
            for (int j = 0; j < officeWidth; j++) {
                office[i][j] = row.charAt(j);
                if (office[i][j] == pDeskColor) {
                    pOfficeLength.add(i);
                    pOfficeWidth.add(j);
                }
            }
        }

        int pOfficeLengthSize = pOfficeLength.get(pOfficeLength.size() - 1) - pOfficeLength.get(0) + 1;
        int pOfficeWidthSize = pOfficeWidth.get(pOfficeWidth.size() - 1) - pOfficeWidth.get(0) + 1;

        ArrayList<Character> adjacents = new ArrayList<Character>();
        int adjacentsCount = 0;

        // check row before president's desk

        if (pOfficeLength.get(0) != 0) {
            for (int i = pOfficeWidth.get(0); i < pOfficeWidth.get(0) + pOfficeWidthSize; i++) {
                if (office[pOfficeLength.get(0) - 1][i] != pDeskColor && office[pOfficeLength.get(0) - 1][i] != '.') {
                    if (!(adjacents.contains(office[pOfficeLength.get(0) - 1][i]))) {
                        adjacents.add(office[pOfficeLength.get(0) - 1][i]);
                        adjacentsCount++;
                    }
                }
            }
        }

        // check row after president's desk

        if (pOfficeLength.get(pOfficeLength.size() - 1) < officeLength - 1) {
            for (int i = pOfficeWidth.get(0); i < pOfficeWidth.get(0) + pOfficeWidthSize; i++) {
                if (office[pOfficeLength.get(pOfficeLength.size() - 1) + 1][i] != pDeskColor
                        && office[pOfficeLength.get(pOfficeLength.size() - 1) + 1][i] != '.') {
                    if (!(adjacents.contains(office[pOfficeLength.get(pOfficeLength.size() - 1) + 1][i]))) {
                        adjacents.add(office[pOfficeLength.get(pOfficeLength.size() - 1) + 1][i]);
                        adjacentsCount++;
                    }
                }
            }
        }

        // check column before president's desk

        if (pOfficeWidth.get(0) != 0) {
            for (int i = pOfficeLength.get(0); i < pOfficeLength.get(0) + pOfficeLengthSize; i++) {
                if (office[i][pOfficeWidth.get(0) - 1] != pDeskColor && office[i][pOfficeWidth.get(0) - 1] != '.') {
                    if (!(adjacents.contains(office[i][pOfficeWidth.get(0) - 1]))) {
                        adjacents.add(office[i][pOfficeWidth.get(0) - 1]);
                        adjacentsCount++;
                    }
                }
            }
        }

        // check column after president's desk

        if (pOfficeWidth.get(pOfficeWidth.size() - 1) < officeWidth - 1) {
            for (int i = pOfficeLength.get(0); i < pOfficeLength.get(0) + pOfficeLengthSize; i++) {
                if (office[i][pOfficeWidth.get(pOfficeWidth.size() - 1) + 1] != pDeskColor
                        && office[i][pOfficeWidth.get(pOfficeWidth.size() - 1) + 1] != '.') {
                    if (!(adjacents.contains(office[i][pOfficeWidth.get(pOfficeWidth.size() - 1) + 1]))) {
                        adjacents.add(office[i][pOfficeWidth.get(pOfficeWidth.size() - 1) + 1]);
                        adjacentsCount++;
                    }
                }
            }
        }

        System.out.println(adjacentsCount);
    }
}