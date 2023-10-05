import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        int mid = str.length() / 2;

        if (length % 2 == 0) {
            String temp1 = str.substring(0, mid - 1);
            String temp2 = str.substring(mid + 1, length);
            System.out.println(temp1 + temp2);
        } else {
            String temp1 = str.substring(0, mid);
            String temp2 = str.substring(mid + 1, length);
            System.out.println(temp1 + temp2);
        }
    }
}
