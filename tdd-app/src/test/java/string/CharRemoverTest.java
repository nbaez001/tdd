package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharRemoverTest {

    @Test
    public void StringHavingAInFirstCharactersOnlyTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("BCD", helper.removeAInFirst2Chars("ABCD"));
    }

    @Test
    public void StringHavingNoAInFirstCharactersOnlyTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("BBAA", helper.removeAInFirst2Chars("BBAA"));
    }

    @Test
    public void StringHavingAInInFirst2CharsAnd4CharTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("BBA", helper.removeAInFirst2Chars("ABBA"));
    }

    @Test
    public void StringWith2CharsTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("B", helper.removeAInFirst2Chars("AB"));
    }

    @Test
    public void StringWith1CharTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("B", helper.removeAInFirst2Chars("B"));
    }

    @Test
    public void StringWithAAs1CharTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("", helper.removeAInFirst2Chars("A"));
    }

    @Test
    public void StringWithEmptyStringTest() {
        CharRemover helper = new CharRemover();
        Assertions.assertEquals("", helper.removeAInFirst2Chars(""));
    }
}
