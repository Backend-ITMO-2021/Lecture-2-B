package ru.ifmo.backend_2021.markup;

public class Text implements Block{
    private String string;
    public Text(String string){
        this.string = string;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(this.string);
        return stringBuilder;
    }
}
