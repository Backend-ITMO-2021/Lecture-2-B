package ru.ifmo.backend_2021.markup;

import java.util.*;

public class Strong implements MarkdownInterface {

    private List<MarkdownInterface> children;
    private static final String MARKDOWN_CHAR = "__";

    public Strong(List<MarkdownInterface> children) {
        this.children = children;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder buffer) {
        buffer.append(MARKDOWN_CHAR);
        this.children.forEach(child -> child.toMarkdown(buffer));
        buffer.append(MARKDOWN_CHAR);
        return buffer;
    }
}