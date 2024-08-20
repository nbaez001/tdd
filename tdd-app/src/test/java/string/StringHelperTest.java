package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHelperTest {

    @Test
    public void StrWith2CharsIsReversedTheLast2CharactersTest() {
        StringHelper helper = new StringHelper();
        Assertions.assertEquals("BA", helper.swapLastTwoChars("AB"));
    }

    @Test
    public void StrWith4CharsIsReversedTheLast2CharactersTest() {
        StringHelper helper = new StringHelper();
        Assertions.assertEquals("ABDC", helper.swapLastTwoChars("ABCD"));
    }

    @Test
    public void StrWith10CharsIsReversedTheLast2CharactersTest() {
        StringHelper helper = new StringHelper();
        Assertions.assertEquals("ABCDEFGHIJ", helper.swapLastTwoChars("ABCDEFGHJI"));
    }

    @Test
    public void StrWith1CharsReturnThaSameCharactersTest() {
        StringHelper helper = new StringHelper();
        Assertions.assertEquals("A", helper.swapLastTwoChars("A"));
    }

    @Test
    public void StrEmptyReturnTheSameTest() {
        StringHelper helper = new StringHelper();
        Assertions.assertEquals("", helper.swapLastTwoChars(""));
    }
}
