package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends Markdown implements MarkdownInterface {

    public Strong(List<MarkdownInterface> elements) {
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder result) {
       return toMarkdown(result, "__");
    }
}
