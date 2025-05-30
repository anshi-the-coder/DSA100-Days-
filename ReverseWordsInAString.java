import java.util.*;

class Solution {
    public static String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "  the sky   is  blue  ";
        String result = reverseWords(input);
        System.out.println("Reversed: " + result); 
    }
}
