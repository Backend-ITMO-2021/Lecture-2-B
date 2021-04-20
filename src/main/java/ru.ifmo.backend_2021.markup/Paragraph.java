package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements MarkdownElement {
    List<MarkdownElement> elements;

    public Paragraph(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        for (MarkdownElement e : elements) {
            e.toMarkdown(str);
        }
        return str;
    }
}