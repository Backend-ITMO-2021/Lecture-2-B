package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;
import java.util.List;

public class Strikeout implements MarkdownElement {
    List<MarkdownElement> elements;

    public Strikeout() {
        this.elements = new ArrayList();
    }

    public Strikeout(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        str.append("~");
        for (MarkdownElement e : elements) {
            e.toMarkdown(str);
        }
        str.append("~");
        return str;
    }
}
