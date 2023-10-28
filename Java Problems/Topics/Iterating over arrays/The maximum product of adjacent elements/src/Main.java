import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          int max = 0;
          int [] arr = new int [n];
          for (int i = 0; i < arr.length; i++) {
              arr[i] = scanner.nextInt();
          }
          for (int j = 1; j < arr.length; j++) {
              max = max < arr[j] * arr[j - 1] ? arr[j] * arr[j - 1] : max;
          }
          System.out.println(max);
    }
}
