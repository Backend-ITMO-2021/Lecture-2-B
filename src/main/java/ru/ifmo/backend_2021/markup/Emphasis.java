package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends Markdown implements MarkdownInterface {

    public Emphasis(List<MarkdownInterface> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder result) {
        return toMarkdown(result, "*");
    }
}
