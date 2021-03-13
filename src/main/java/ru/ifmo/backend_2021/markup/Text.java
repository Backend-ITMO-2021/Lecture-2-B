package ru.ifmo.backend_2021.markup;

public class Text extends Markup {
    private final String text;
    public Text(String text){
        this.text = text;
    }
    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        return stringBuilder.append(text);
    }
}
