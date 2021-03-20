package ru.ifmo.backend_2021.markup;

public class Text implements Mark{
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(text);
        return output;
    }
}