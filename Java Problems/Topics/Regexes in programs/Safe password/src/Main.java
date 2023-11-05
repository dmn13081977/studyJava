import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String s1 = "[a-zA-Z_0-9]{12,}";
        String s2 = ".*[a-z].*";
        String s3 = ".*[A-Z].*";
        String s4 = ".*[0-9].*";

        //String regex = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).{12,}";

        if (pass.matches(s1) && pass.matches(s2) && pass.matches(s3) && pass.matches(s4)) System.out.println("YES");
        else System.out.println("NO");
    }
}
