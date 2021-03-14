package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends AbstractMarkdown {
    public Strong(List<Markdownable> children) {
        super(children, "__");
    }
}