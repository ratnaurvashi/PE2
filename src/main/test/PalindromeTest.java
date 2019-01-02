import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome test;

    @Before
    public void setUp() throws Exception {
        test = new Palindrome();
    }

    @Test
    public void testIsPalindrome(){
        boolean result = test.checkPalindrome("aabaa");
        assertEquals(true,result);
    }
    @Test
    public void testIsNotPalindrome(){
        boolean result = test.checkPalindrome("aaba");
        assertNotEquals(true,result);
    }
}