import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regExMatch = "\\s+";
        String replacedText = text.replaceAll(regExMatch, " ").trim();
        System.out.println(replacedText);
    }
}