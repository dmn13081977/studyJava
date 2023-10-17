import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> first = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<String> second = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        int firstOccurrence = Collections.indexOfSubList(first, second);
        int lastOccurrence = Collections.lastIndexOfSubList(first, second);

        System.out.printf("%d %d", firstOccurrence, lastOccurrence);
    }
}