package ru.ifmo.backend_2021.markup;

import java.util.List;

/*
 * '~'
 */
public class Strikeout extends SomeMarkdown {
    public Strikeout(List<Markdowns> elements) {
        super(elements, "~");
    }
}
