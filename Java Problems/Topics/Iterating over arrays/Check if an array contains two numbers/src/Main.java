import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        boolean res = false;
        for (int i = 1; i < arr.length; i++ ) {
            if ((arr[i] == n && arr[i - 1] == m) || (arr[i] == m && arr[i - 1] == n)) res = true;
        }
        System.out.println(res);
    }
}