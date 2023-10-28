import java.util.Scanner;
class Main {
    static int min = 10000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          int [] arr = new int [n];
          for (int i = 0; i < arr.length; i++) {
              arr[i] = scanner.nextInt();
              min = min < arr[i] ? min : arr[i];
          }
          System.out.println(min);
    }
}
