package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends AbstractMarkdown{
    public Strikeout(List<Markdownable> children) {
        super(children, "~");
    }
}
