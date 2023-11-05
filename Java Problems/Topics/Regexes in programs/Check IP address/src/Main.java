import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String regExp ="^(?:\\b\\.?(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){4}$";
        if (ip.matches(regExp)) System.out.println("YES");
        else System.out.println("NO");
    }
}