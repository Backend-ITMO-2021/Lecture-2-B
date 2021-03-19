package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends ABCMarkdown{

    public Emphasis(List<Markdown> children, String mark) {
        super(children, mark);
    }
    public Emphasis(List<Markdown> children) {
        this(children, "*");
    }
}