import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          int res = 0;
          int max = 0;
          int n = scanner.nextInt();
          int [] arr = new int [n];
          for (int i = 0; i < arr.length; i++) {
              arr [i] = scanner.nextInt();
              if (max < arr [i]) {
                  max = arr[i];
              }
          }

          for (int j = 0; j < arr.length; j++) {
              if (max == arr [j]) {
                  res = j;
                  break;
              }
          }
          System.out.println(res);
    }
}
