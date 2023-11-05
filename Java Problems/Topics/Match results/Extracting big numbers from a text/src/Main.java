import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();
        String s = "\\d{10,}";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(stringWithNumbers);

        while (matcher.find()) {
            System.out.println(matcher.group() + ":" + (matcher.end() - matcher.start()));
        }
    }
}