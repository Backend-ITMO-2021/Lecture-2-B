package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends toMarkdown{
    public Strikeout(List<Mark> list) {
        super(list, "~");
    }
}