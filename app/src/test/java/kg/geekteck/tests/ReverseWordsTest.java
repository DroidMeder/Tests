package kg.geekteck.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseWordsTest {
    ReverseWords reverseWords;

    @Before
    public void setup(){
        reverseWords=new ReverseWords();
    }

    @Test
    public void reverseTwoWords(){
        assertEquals("Two One", reverseWords.reverseString("One Two"));
    }
    @Test
    public void reverseThreeWords(){
        assertEquals("Five Four Three Two One",
                reverseWords.reverseString("One Two Three Four Five"));
    }
    @Test
    public void reverseSpacedWords(){
        assertEquals("Three Two One",
                reverseWords.reverseString("         One Two Three        "));
    }

}
