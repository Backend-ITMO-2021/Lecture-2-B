package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class AbstractMarkdown implements Markdownable {
    private List<Markdownable> children;
    private String mark;

    public AbstractMarkdown(List<Markdownable> children, String mark) {
        this.children = children;
        this.mark = mark;
    }

    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(mark);
        children.forEach(child -> child.toMarkdown(sb));
        sb.append(mark);
        return sb;
    }
}