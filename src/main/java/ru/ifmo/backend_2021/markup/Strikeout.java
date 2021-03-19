package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends Markdown {

    public Strikeout(List<AbstractMarkdown> children) {
        super(children, "~");
    }

}