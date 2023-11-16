import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
//        if (str == null || ((str.length() % 2) != 0)) {
//            System.out.println("false");
//            return;
//        } else {
//            for (int i = 0; i < str.length(); i++) {
//                char x = str.charAt(i);
//                if (x == '(' || x == '[' || x == '{') {
//                    stack.push(x);
//                    continue;
//                }
//                if (stack.isEmpty()) {
//                    System.out.println("false");
//                    return;
//                } else {
//                    char check;
//                    switch (x) {
//                        case ')':
//                            check = stack.pop();
//                            if (check == '{' || check == '[') {
//                                System.out.println("false");
//                                return;
//                            }
//                        case '}':
//                            check = stack.pop();
//                            if (check == '(' || check == '[') {
//                                System.out.println("false");
//                                return;
//                            }
//                        case ']':
//                            check = stack.pop();
//                            if (check == '(' || check == '{') {
//                                System.out.println("false");
//                                return;
//                            }
//                    }
//                }
//            }
//        }
//        System.out.println(stack.isEmpty());


        for (char ch: str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.addFirst(ch);
            } else {
                if (!stack.isEmpty()
                        && ((stack.peekFirst() == '{' && ch == '}')
                        || (stack.peekFirst() == '[' && ch == ']')
                        || (stack.peekFirst() == '(' && ch == ')'))) {
                    stack.removeFirst();
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }

}