import java.io.IOException;
import java.util.Arrays;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        String s = "";
        for (int i = 0; i < words.length; i++) s += words[i];
        char[] chars = s.toCharArray();
        return chars;
        //return String.join("", words).toCharArray();
    }
}