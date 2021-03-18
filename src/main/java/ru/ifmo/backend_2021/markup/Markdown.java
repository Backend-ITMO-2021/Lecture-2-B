package ru.ifmo.backend_2021.markup;

import java.util.List;

abstract class Markdown implements MarkdownInterface {
    private final List<MarkdownInterface> elements;

    protected Markdown(List<MarkdownInterface> elements) {
        this.elements = elements;
    }

    protected StringBuilder toMarkdown(StringBuilder result, String border) {
        result.append(border);
        for (MarkdownInterface cur : elements) {
            cur.toMarkdown(result);
        }
        result.append(border);
        return result;
    }
}
