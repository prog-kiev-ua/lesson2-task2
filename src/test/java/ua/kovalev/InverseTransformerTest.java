package ua.kovalev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InverseTransformerTest {

    @Test
    void testTransform() {
        String text = "Hello";

        TextTransformer tt = new InverseTransformer();
        String newText = tt.transform(text);

        assertEquals(newText.length(), text.length());

        char[] expectedChars = newText.toCharArray();
        char[] srcChars = text.toCharArray();
        for (int i = 0; i < expectedChars.length; i++) {
            assertEquals(expectedChars[i],srcChars[srcChars.length-i-1]);
        }
    }
}