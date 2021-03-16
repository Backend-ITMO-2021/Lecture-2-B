package ru.ifmo.backend_2021.markup;

public class Text implements CustomMarkdown{
    private final String text;

    public Text(String curText) {
        text = curText;
    }

    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(text);
        return output;
    }
}
