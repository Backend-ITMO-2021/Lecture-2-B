package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements Markdowns {
    private final List<Markdowns> elements;

    public Paragraph(List<Markdowns> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder output) {
        elements.forEach(element -> element.toMarkdown(output));

        return output;
    }
}
