import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal Dwalin = scanner.nextBigDecimal();
        BigDecimal Balin = scanner.nextBigDecimal();
        BigDecimal Thorin = scanner.nextBigDecimal();
        System.out.println((Dwalin.add(Balin)).add(Thorin));
    }
}