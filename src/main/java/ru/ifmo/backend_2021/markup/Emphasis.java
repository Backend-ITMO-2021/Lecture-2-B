package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends Paragraph implements MarkdownElement {

    public Emphasis(List<MarkdownElement> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        buffer.append("*");
        super.toMarkdown(buffer);
        return buffer.append("*");
    }
}
