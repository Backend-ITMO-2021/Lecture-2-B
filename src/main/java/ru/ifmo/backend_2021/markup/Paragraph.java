package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends Markup {
    private final List<Markup> text;

    public Paragraph(List<Markup> text) {
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        text.forEach(markup -> markup.toMarkdown(stringBuilder));
        return stringBuilder;
    }
}
