package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends AbstractMarkdown{
    public Emphasis(List<Markdownable> children) {
        super(children, "*");
    }
}
