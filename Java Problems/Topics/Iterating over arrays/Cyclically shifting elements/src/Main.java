import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 1; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        array[0] = scanner.nextInt();
        for (int v : array) {
            System.out.print(v + " ");
        }
    }
}
