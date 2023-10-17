import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List> table = new ArrayList<>();
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++){
                row.add(scanner.nextInt());
            }
            table.add(row);
        }
        int rotations = scanner.nextInt();

        Collections.rotate(table, rotations);

        for (int i = 0; i < rows; i++){
            List<Integer> row = table.get(i);
            for (int j = 0; j < columns; j++){
                System.out.printf("%d ", row.get(j));
            }
            System.out.println();
        }
    }

}