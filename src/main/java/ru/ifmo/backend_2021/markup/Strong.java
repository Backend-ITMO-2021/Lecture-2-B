package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends Paragraph implements MarkdownElement {

    public Strong(List<MarkdownElement> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        buffer.append("__");
        super.toMarkdown(buffer);
        return buffer.append("__");
    }
}
