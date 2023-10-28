import java.util.Scanner;

class Problem {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}