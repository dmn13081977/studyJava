import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();        
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

class InputStringReader {
    public Optional<String> getValue() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Optional<String> optString;
        if (!string.equals("empty")) {
            optString = Optional.ofNullable(string);
        } else {
            optString = Optional.ofNullable(null);
        }
        return optString;
    }
}