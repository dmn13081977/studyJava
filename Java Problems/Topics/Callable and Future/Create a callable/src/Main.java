import java.util.Scanner;
import java.util.concurrent.Callable;

class CallableUtil {
    public static Callable<String> getCallable() {
        return () -> new Scanner(System.in).nextLine();
    }
}