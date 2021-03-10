package ru.ifmo.backend_2021.markup;


import java.util.List;

public class Strikeout extends MarkAbstract {
    public Strikeout(List<MarkDown> markDownList) {
        super(markDownList, "~");
    }
}
