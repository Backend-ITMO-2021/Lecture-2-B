package ru.ifmo.backend_2021.markup;

public class Text implements MarkdownInterface {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public StringBuilder toMarkdown(StringBuilder buffer) {
        buffer.append(text);
        return buffer;
    }
}
