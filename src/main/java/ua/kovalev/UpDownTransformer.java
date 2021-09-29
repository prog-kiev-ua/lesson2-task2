package ua.kovalev;

public class UpDownTransformer extends TextTransformer{
    public UpDownTransformer() {
        super();
    }

    @Override
    public String transform(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i%2==0)
                chars[i] = Character.toUpperCase(chars[i]);
            else
                chars[i] = Character.toLowerCase(chars[i]);
        }
        return new String(chars);
    }
}
