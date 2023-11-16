import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal amount = new BigDecimal(scanner.nextLine());
        BigDecimal percent = new BigDecimal(scanner.nextLine());
        int years = scanner.nextInt();
        System.out.println("Amount of money in the account: " +
                (amount.multiply((BigDecimal.ONE.add(percent.divide(new BigDecimal("100"))))
                        .pow(years))).setScale(2, RoundingMode.CEILING));
    }
}