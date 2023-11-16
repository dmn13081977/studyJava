import java.util.Arrays;
import java.util.function.Predicate;

class Problem {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("default");
            return;
        }
       //boolean check1 = Arrays.stream(args).anyMatch(Predicate.isEqual("parameter1"));
       //boolean check2 = Arrays.stream(args).anyMatch(Predicate.isEqual("parameter2"));
        for (int i = 0; i < args.length; i += 2){
            if ("mode".equals(args[i]) && i + 1 < args.length) {
                System.out.println(args[i + 1]);
                return;
            }
        }
        System.out.println("default");
    }
}