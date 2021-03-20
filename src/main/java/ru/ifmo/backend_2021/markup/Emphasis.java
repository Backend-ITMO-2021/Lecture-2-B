package ru.ifmo.backend_2021.markup;

import java.util.List;

/*
 * '*'
 */
public class Emphasis extends SomeMarkdown {
    public Emphasis(List<Markdowns> elements) {
        super(elements, "*");
    }
}
