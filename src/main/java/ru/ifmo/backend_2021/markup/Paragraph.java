package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends Markdown implements MarkdownInterface {
    public Paragraph(List<MarkdownInterface> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder result) {
        return toMarkdown(result, "");
    }
}
