import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        int newScale = scanner.nextInt();
        System.out.println(n.setScale(newScale, RoundingMode.HALF_DOWN));
    }   
}