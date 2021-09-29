package ua.kovalev;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class TextSaverTest {

    @Test
    void testSaveTextToFile() {
        String text = "Lorem ipsum dolor sit amet";
        String path = "log_test.txt";
        TextTransformer tt = new InverseTransformer();

        File file = new File(path);
        if(file.exists()) file.delete();

        TextSaver tSaver = new TextSaver(tt, path);
        tSaver.saveTextToFile(text);

        file = new File(path);
        assertTrue(file.exists());

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);){

            assertTrue(text.equals(tt.transform(bufferedReader.readLine())));

            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}