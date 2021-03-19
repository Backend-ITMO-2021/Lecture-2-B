package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends ABCMarkdown{
    public Strong(List<Markdown> children, String mark) {
        super(children, mark);
    }
    public Strong(List<Markdown> children) {
        this(children, "__");
    }
}