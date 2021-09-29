package ua.kovalev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UpDownTransformerTest {

    @Test
    void transform() {
        String text = "Hello";

        TextTransformer tt = new UpDownTransformer();
        String newText = tt.transform(text);

        assertEquals(text.length(), newText.length());
        char[] expectedChars = newText.toCharArray();
        for (int i = 0; i < expectedChars.length; i++) {
            if(i%2==0)
                assertTrue(Character.isUpperCase(expectedChars[i]));
            else
                assertTrue(Character.isLowerCase(expectedChars[i]));
        }
    }
}