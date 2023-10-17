import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Collections.addAll(list, scanner.nextLine().split("\\s+"));

        int swaps = scanner.nextInt();

        for(int i = 0; i < swaps; i++){
            Collections.swap(list, scanner.nextInt(), scanner.nextInt());
        }

        list.forEach(elem -> System.out.printf("%s ", elem));
    }
}