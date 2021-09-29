package ua.kovalev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
    private TextTransformer textTransformer;
    private File file;

    public TextSaver(TextTransformer textTransformer, String path) {
        this.textTransformer = textTransformer;
        this.file = new File(path);
        if(this.file.exists()) file.delete();
    }

    public void saveTextToFile(String text){
        boolean fileCreated = false;
        try {
            if(!file.exists())
                fileCreated = file.createNewFile();
            else
                fileCreated = true;
        } catch (IOException e) {
        }
        finally {
            if(!fileCreated){
                System.out.println("Ошибка создания файла");
                return;
            }
        }
        String newText = textTransformer.transform(text);
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write(newText+"\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
