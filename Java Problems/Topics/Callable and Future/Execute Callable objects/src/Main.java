import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        int sum = 0;

        for (int i = items.size() - 1; i >= 0; i--) {
            try {
                sum += items.get(i).get().call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }

//    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
//        Collections.reverse(items);
//        return items.stream()
//                .mapToInt(f -> {
//                    try {
//                        return f.get().call();
//                    } catch (Exception e) {
//                        throw new IllegalStateException("tasks interrupted", e);
//                    }
//                }).sum();
//    }

}