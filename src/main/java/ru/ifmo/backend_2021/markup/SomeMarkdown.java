package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class SomeMarkdown implements Markdowns {
    private final List<Markdowns> elements;
    private final String markChar;

    public SomeMarkdown(List<Markdowns> elements, String markChar) {
        this.elements = elements;
        this.markChar = markChar;
    }

    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(markChar);
        elements.forEach(element -> element.toMarkdown(output));
        output.append(markChar);

        return output;
    }
}
