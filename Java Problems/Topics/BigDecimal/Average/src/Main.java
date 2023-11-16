import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();
        BigDecimal c = scanner.nextBigDecimal();
        System.out.println(((a.add(b)).add(c)).divide(BigDecimal.valueOf(3), 0, RoundingMode.DOWN));

    }
}