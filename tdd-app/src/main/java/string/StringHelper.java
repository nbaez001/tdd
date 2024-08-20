package string;

public class StringHelper {
    public String swapLastTwoChars(String str) {
        int length = str.length();
        if (length < 2) return str;
        String strMinusLast2Chars = str.substring(0, length - 2);
        char secondLastChar = str.charAt(length - 2);
        char lastChar = str.charAt(length - 1);
        return strMinusLast2Chars + lastChar + secondLastChar;
    }
}
