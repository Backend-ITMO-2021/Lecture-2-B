package ru.ifmo.backend_2021.markup;

public class Text implements MarkdownElement {

    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        return buffer.append(content);
    }
}
