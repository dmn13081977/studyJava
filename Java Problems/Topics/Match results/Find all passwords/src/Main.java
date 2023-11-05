import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String s = "password:?\\s*(\\w+)";

        Pattern p = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        int count = 0;
        while (m.find()) {
            System.out.println(m.group(1));
            count++;
        }
        if (count == 0) System.out.println("No passwords found.");

//        if (Pattern.compile("(?i)password[\\s:]*(\\w+)").matcher(text).results()
//                .map(mr -> mr.group(1))
//                .peek(System.out::println)
//                .collect(Collectors.toList()).isEmpty()) {
//            System.out.println("No passwords found.");
//        }
    }
}