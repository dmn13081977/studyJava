import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        while (n > 0) {
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n -= 2;
        }
        return factorial;
    }
}