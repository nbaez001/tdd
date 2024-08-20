package string;

public class CharRemover {
    public String removeAInFirst2Chars(String str) {
        if (str.length() < 2) return str.replaceAll("A", "");
        String first2Chars = str.substring(0, 2);
        String afterFirst2Chars = str.substring(2);
        return first2Chars.replaceAll("A", "") + afterFirst2Chars;
    }
}
