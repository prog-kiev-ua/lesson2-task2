package ua.kovalev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTransformerTest {

    @Test
    void testTransform() {
        String text = "Hello";

        TextTransformer tt = new TextTransformer();
        String newText = tt.transform(text);

        assertEquals(text.length(), newText.length());

        char[] expectedChars = newText.toCharArray();
        for (int i = 0; i < expectedChars.length; i++) {
            assertTrue(Character.isUpperCase(expectedChars[i]));
        }
    }
}