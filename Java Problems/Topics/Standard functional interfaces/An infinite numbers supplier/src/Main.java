import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        Integer[] num = {0};
        return () -> num[0]++;
    }

}