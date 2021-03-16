package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements MarkdownInterface {
    private List<MarkdownInterface> elements;

    public Paragraph(List<MarkdownInterface> elements) {
        this.elements = elements;
    }

    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        for (int i = 0; i < this.elements.size(); i++) {
            this.elements.get(i).toMarkdown(stringBuilder);
        }
        return stringBuilder;
    }

}