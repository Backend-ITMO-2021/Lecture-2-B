package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends Markdown {
    public Strong(List<MarkdownInterface> elements) {
        super(elements, "__");
    }
}