package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Markdown implements AbstractMarkdown {

    private List<AbstractMarkdown> children;

    private final String MARK;

    Markdown(List<AbstractMarkdown> children, String mark) {
        this.children = children;
        this.MARK = mark;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuild) {
        stringBuild.append(MARK);
        children.forEach(child -> child.toMarkdown(stringBuild));
        stringBuild.append(MARK);

        return stringBuild;
    }
}