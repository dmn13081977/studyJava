import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, marker = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) marker++;
                else marker = 0;
                if (marker == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}