import java.util.Scanner;


class CheckTheEssay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String result1 = text.replaceAll("Franse", "France");
        String result2 = result1.replaceAll("Eifel tower", "Eiffel Tower");
        String result3 = result2.replaceAll("19th", "XIXth");
        String result4 = result3.replaceAll("20th", "XXth");
        String result5 = result4.replaceAll("21st", "XXIst");
        System.out.println(result5);
    }
}