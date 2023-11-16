import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> currentMax = new ArrayDeque<>();
        currentMax.offerFirst(0);
        int max;

        for (int i = 0; i < lines; i++){
            String command = scanner.next();
            max = currentMax.size() > 0 ? currentMax.peekFirst() : 0;

            switch (command){
                case "push":
                    int number = Integer.parseInt(scanner.next());
                    stack.offerFirst(number);
                    if (number > max){
                        max = number;
                    }
                    currentMax.offerFirst(max);
                    break;
                case "pop":
                    stack.pollFirst();
                    currentMax.pollFirst();
                    break;
                case "max":
                    System.out.println(max);
                    break;
                default:
                    return;
            }
        }


//        Deque<Integer> stk = new ArrayDeque<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0) {
//            switch (s.next()) {
//                case "push": int i = s.nextInt();
//                    stk.push(stk.isEmpty() || i >= stk.peek() ? i : stk.peek());
//                    break;
//                case "pop": stk.pop();
//                    break;
//                default: System.out.println(stk.peek());
//            }
//        }


    }
}