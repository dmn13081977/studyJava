import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class FindTheKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String s = "keY\\s+ is\\s+(([1-9BCDFGHJKLMNPQRSTVWXYZ]+(\\s+|\\s*$))|([?!#AEIOU]+(\\s+|\\s*$)))";

        Pattern p = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group(1).trim());
        }

    }
}