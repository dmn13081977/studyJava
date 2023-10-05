import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[1]);
        String s = arr[0];
        if (n > s.length() || n <= 0) {
            System.out.println(s);
        } else {
            String s1 = s.substring(0, n);
            String s2 = s.substring(n, s.length());
            System.out.println(s2 + s1);
        }
    }
}
