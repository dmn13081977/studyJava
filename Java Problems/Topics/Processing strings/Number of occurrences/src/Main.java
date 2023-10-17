import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String part = scanner.nextLine();

        Pattern pattern = Pattern.compile(part);
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}