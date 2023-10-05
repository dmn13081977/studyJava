import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\w*)=(\\w*)");
        Matcher matcher = pattern.matcher(url);
        String pass = "";
        while (matcher.find()) {
            if (matcher.group(1).equals("pass")) pass = matcher.group(2);
            if (matcher.group(1).equals("cookie") && (matcher.group(2).equals(""))) {
                System.out.println("cookie : not found");
            } else {
                System.out.println(matcher.group(1) + " : " + matcher.group(2));
            }
        }
        if (url.contains("pass")) 
            System.out.println("password : " + pass);
    }
}
