package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends Markdown {
    public Emphasis(List<MarkdownInterface> elements) {
        super(elements, "*");
    }
}