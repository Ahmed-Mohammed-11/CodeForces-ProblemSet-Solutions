import java.util.*;

public class BurglarAndMatches {
    public class Container {
        int matches;
        int matchBox;

        public Container(int matches, int matchBox) {
            this.matches = matches;
            this.matchBox = matchBox;
        }
    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int rucksackSize = myScanner.nextInt();
        int numberOfContainers = myScanner.nextInt();
        ArrayList<Container> containers = new ArrayList<>();
        for (int i = 0; i < numberOfContainers; i++) {
            int matcheBox = myScanner.nextInt();
            int matches = myScanner.nextInt();
            containers.add(new BurglarAndMatches().new Container(matches, matcheBox));
        }

        // using lambda function to sort the list descendingly
        Collections.sort(containers, (obj1, obj2) -> {
            return obj2.matches - obj1.matches;
        });

        // anothter way to sort the list descendingly
        // Collections.sort(containers, Collections.reverseOrder(new
        // Comparator<Container>() {
        // @Override
        // public int compare(Container o1, Container o2) {
        // return o1.matches - o2.matches;
        // }
        // }));

        // third way to sort the list descendingly
        // Collections.sort(containers, new Comparator<Container>() {
        // @Override
        // public int compare(Container o1, Container o2) {
        // return o2.matches - o1.matches;
        // }
        // });

        int maxMatches = 0;
        for (int i = 0; i < numberOfContainers; i++) {

            if (rucksackSize <= containers.get(i).matchBox) {
                maxMatches += rucksackSize * containers.get(i).matches;
                break;
            }

            else {
                maxMatches += containers.get(i).matchBox * containers.get(i).matches;
                rucksackSize -= containers.get(i).matchBox;
            }

        }

        System.out.println(maxMatches);
    }
}

// unworking solution but i liked it
// public static void calculateMaxMatches(int rucksackSize, List<Integer>
// matchBoxes, List<Integer> matches,
// int maxMatches) {

// if(rucksackSize == 0 || matchBoxes.size() == 0)
// {
// System.out.println(maxMatches);
// return;
// }

// int firstMatchBox = matchBoxes.get(0);
// int firstMatches = matches.get(0);

// if (rucksackSize <= firstMatchBox)
// {
// maxMatches += rucksackSize * firstMatches;
// System.out.println(maxMatches);
// }
// else
// {
// maxMatches += firstMatchBox * firstMatches;
// rucksackSize -= firstMatchBox;
// matchBoxes.remove(0);
// matches.remove(0);
// calculateMaxMatches(rucksackSize, matchBoxes, matches, maxMatches);
// }
// }

// public static void main(String[] args) {
// Scanner myScanner = new Scanner(System.in);
// int rucksackSize = myScanner.nextInt();
// int numberOfContainers = myScanner.nextInt();
// ArrayList<Integer> matchBoxes = new ArrayList<>();
// ArrayList<Integer> matches = new ArrayList<>();
// ArrayList<Integer> matchBoxes2 = new ArrayList<>();
// ArrayList<Integer> matches2 = new ArrayList<>();

// for (int i = 0; i < numberOfContainers; i++) {
// int matcheBox = myScanner.nextInt();
// int match = myScanner.nextInt();
// matchBoxes.add(matcheBox);
// matches.add(match);
// }

// for (int i = 0; i < numberOfContainers; i++) {
// matches2.add(matches.get(i));
// }

// Collections.sort(matches2, Collections.reverseOrder());

// ArrayList<Integer> currPosition = new ArrayList<>();

// for (int i = 0; i < numberOfContainers; i++) {
// currPosition.add(matches.indexOf(matches2.get(i)));
// }

// for (int i = 0; i < numberOfContainers; i++) {
// matchBoxes2.add(matchBoxes.get(currPosition.get(i)));
// }

// calculateMaxMatches(rucksackSize, matchBoxes2, matches2, 0);
// }

// another unworking solution but I think it's close to the right answer
// public static void calculateMaxMatches(int rucksackSize, Map<Integer,
// Integer> containerContent, int maxMatches){

// int firstKey = containerContent.entrySet().iterator().next().getKey();
// int firstValue = containerContent.entrySet().iterator().next().getValue();

// if(rucksackSize <= firstKey)
// {
// maxMatches += rucksackSize * firstValue;
// System.out.println(maxMatches);
// }
// else
// {
// maxMatches += firstKey * firstValue;
// rucksackSize -= firstKey;
// containerContent.remove(firstKey);
// calculateMaxMatches(rucksackSize, containerContent, maxMatches);
// }
// }

// public static void main(String[] args){

// Scanner myScanner = new Scanner(System.in);
// int rucksackSize = myScanner.nextInt();
// int numberOfContainers = myScanner.nextInt();
// Map<Integer, Integer> containerContent = new HashMap<>();
// LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();

// for(int i = 0 ; i < numberOfContainers ; i ++){
// int matcheBox = myScanner.nextInt();
// int matches = myScanner.nextInt();
// if(containerContent.containsKey(matcheBox))
// break;
// else
// containerContent.put(matcheBox, matches);
// // containerContent.put(matcheBox, matches);
// }

// //reverse sort the map

// containerContent.entrySet()
// .stream()
// .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
// .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

// calculateMaxMatches(rucksackSize, reverseSortedMap, 0 );
// }