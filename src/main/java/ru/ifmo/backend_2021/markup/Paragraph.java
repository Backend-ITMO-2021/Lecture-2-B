package ru.ifmo.backend_2021.markup;

import java.util.*;

public class Paragraph implements MarkdownInterface {

    private List<MarkdownInterface> children;

    public Paragraph(List<MarkdownInterface> children) {
        this.children = children;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        this.children.forEach(child -> child.toMarkdown(buffer));
        return buffer;
    }
}