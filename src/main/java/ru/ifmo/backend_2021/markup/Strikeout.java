package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends Paragraph implements MarkdownElement {

    public Strikeout(List<MarkdownElement> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        buffer.append("~");
        super.toMarkdown(buffer);
        return buffer.append("~");
    }
}
