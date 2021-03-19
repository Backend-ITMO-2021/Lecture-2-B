package ru.ifmo.backend_2021.markup;

public class Text implements Markdown {
    private final String value;

    public Text(String value) {
        this.value = value;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        return str.append(value);
    }
}