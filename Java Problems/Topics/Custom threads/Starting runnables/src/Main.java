import java.util.Arrays;

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        Arrays.stream(runnables).forEach(i -> new Thread(i).start());
    }

//    public static void startRunnables(Runnable[] runnables) {
//        Arrays.stream(runnables).map(Thread::new).forEach(Thread::start);
//    }
}