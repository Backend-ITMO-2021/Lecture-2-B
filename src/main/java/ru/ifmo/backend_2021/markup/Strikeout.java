package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends Markdown implements MarkdownInterface {
    public Strikeout(List<MarkdownInterface> elements){
        super(elements);
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder result) {
        return toMarkdown(result, "~");
    }
}
