import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < elements; i++){
            stack.offerFirst(scanner.nextLine());
        }

        for (int i = 0; i < elements; i++){
            System.out.println(stack.pollFirst());
        }
    }
}