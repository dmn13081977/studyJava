import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] a = scanner.nextLine().split("-");

        System.out.print(a[1] + "/" + a[2] + "/" + a[0]);
    }
}