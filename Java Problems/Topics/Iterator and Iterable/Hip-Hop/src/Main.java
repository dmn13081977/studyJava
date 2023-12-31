import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void iterateOverList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.equals("Hip")) iter.add("Hop");
        }

//        while (iter.hasNext()) {
//            if ("Hip".equals(iter.next())) {
//                iter.add("Hop");
//            }
//        }
    }

    public static void printList(ListIterator<String> iter) {
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}