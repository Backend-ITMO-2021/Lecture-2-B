package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends AbstractMarkdown {

    public Paragraph(List<Markdownable> children) {
        super(children, "");
    }
}
