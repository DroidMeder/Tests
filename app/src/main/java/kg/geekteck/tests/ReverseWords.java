package kg.geekteck.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public String reverseString(String words) {
        String ss = "";
        String[] reversedWords = words.split(" ");
        List<String> rev = new ArrayList<>();

        for (int i = 0; i < reversedWords.length; i++) {
            if (!reversedWords[i].isEmpty()) {
                if (i == reversedWords.length-1) {
                    rev.add(reversedWords[i]);
                } else {
                    rev.add(" " + reversedWords[i]);
                }
            }
        }
        Collections.reverse(rev);
        for (String s : rev) {
            ss += s;
        }
        return ss;
    }
}
