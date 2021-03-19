package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements MarkdownElement {

    private List<MarkdownElement> elements;

    public Paragraph(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        for (MarkdownElement element : elements) {
            element.toMarkdown(buffer);
        }

        return buffer;
    }
}
