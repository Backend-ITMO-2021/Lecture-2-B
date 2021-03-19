package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends Markdown {

    public Paragraph(List<AbstractMarkdown> children) {
        super(children, "");
    }

}