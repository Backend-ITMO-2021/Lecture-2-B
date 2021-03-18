package ru.ifmo.backend_2021.markup;

public class Text implements MarkdownInterface {

    private final String text;

    public Text(String str) {
        this.text = str;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder result) {
        return result.append(text);
    }
}
