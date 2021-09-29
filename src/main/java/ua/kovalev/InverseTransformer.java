package ua.kovalev;

public class InverseTransformer extends TextTransformer{
    public InverseTransformer() {
        super();
    }

    @Override
    public String transform(String text){
        return new StringBuilder(text).reverse().toString();
    }
}
