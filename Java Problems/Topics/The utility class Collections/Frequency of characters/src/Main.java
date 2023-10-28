import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String a = scanner.nextLine();
        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) count++;
        System.out.println(count);

        //System.out.println(Collections.frequency(List.of(scanner.nextLine().split(" ")), scanner.nextLine()));
    }
}