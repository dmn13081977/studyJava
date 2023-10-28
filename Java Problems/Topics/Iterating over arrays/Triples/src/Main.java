import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i + 3 > array.length) {
                    break;
               }
            if (array[i] == array[i + 1] - 1 && array[i] == array[ i + 2] - 2) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
