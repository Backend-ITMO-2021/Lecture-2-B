package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;
import java.util.List;

public class Strong implements MarkdownElement {
    List<MarkdownElement> elements;

    public Strong() {
        this.elements = new ArrayList();
    }

    public Strong(List<MarkdownElement> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        str.append("__");
        for (MarkdownElement e : elements) {
            e.toMarkdown(str);
        }
        str.append("__");
        return str;
    }

}
