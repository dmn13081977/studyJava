
class Problem {
    public static void main(String[] args) {

        String a = args[0];
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        switch (a) {
            case "+" -> System.out.println(b + c);
            case "-" -> System.out.println(b - c);
            case "*" -> System.out.println(b * c);
            default -> System.out.println("Unknown operator");


        }

    }
}