import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal number1 = new BigDecimal(scanner.nextLine());
        BigDecimal number2 = new BigDecimal(scanner.nextLine());
        System.out.println(number1.multiply(number2));
    }
}