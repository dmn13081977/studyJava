import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int j = 1; j < arr.length; j++) {
              if ((arr[j] == n && arr[j - 1] == m) || (arr[j] == m && arr[j - 1] == n)) {
                  System.out.println(false);
                  return;
              }
          }
          System.out.println(true);
    }
}
