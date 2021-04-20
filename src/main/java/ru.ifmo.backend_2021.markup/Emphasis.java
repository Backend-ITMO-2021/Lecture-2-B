package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;
import java.util.List;

public class Emphasis implements MarkdownElement {
    List<MarkdownElement> elements; //Это List, кторый может содержать в себе MarkdownElements 

    public Emphasis() {
        this.elements = new ArrayList();
    }

    public Emphasis(List<MarkdownElement> elementsList) {
        this.elements = elementsList;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        str.append("*");
        for (MarkdownElement e : elements) {
            e.toMarkdown(str);
        }
        str.append("*");
        return str;
    }
}
