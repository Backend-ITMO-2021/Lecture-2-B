package ru.ifmo.backend_2021.markup;


public class Text implements MarkDown {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder builder) {
        builder.append(text);
        return builder;
    }
}
