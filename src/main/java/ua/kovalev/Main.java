package ua.kovalev;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet";

        TextTransformer textTransformer = new TextTransformer();
        TextTransformer textTransformer2 = new UpDownTransformer();
        TextTransformer textTransformer3 = new InverseTransformer();

        TextSaver textSaver = new TextSaver(textTransformer, "log.txt");
        textSaver.saveTextToFile(text);

        textSaver.setTextTransformer(textTransformer2);
        textSaver.saveTextToFile(text);

        textSaver.setTextTransformer(textTransformer3);
        textSaver.saveTextToFile(text);
    }
}
