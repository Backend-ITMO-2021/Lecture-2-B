package ru.ifmo.backend_2021.markup;
import java.util.List;

public abstract class ABCMarkdown implements Markdown {
    private final List<Markdown> children;
    private final String mark;

    public ABCMarkdown(List<Markdown> children, String mark) {
        this.children = children;
        this.mark = mark;
    }

    public StringBuilder toMarkdown(StringBuilder str) {
        str.append(mark);
        children.forEach(child -> child.toMarkdown(str));
        str.append(mark);
        return str;
    }
}
