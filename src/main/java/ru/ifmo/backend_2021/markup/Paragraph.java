package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends ABCMarkdown {

    public Paragraph(List<Markdown> children, String mark) {
        super(children, mark);
    }

    public Paragraph(List<Markdown> children) {
        this(children, "");
    }
}