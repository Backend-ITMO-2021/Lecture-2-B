package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements Markable {
    private final List<Markable> elementsList;

    public Paragraph(List<Markable> elementsList) {
        this.elementsList = elementsList;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        for (Markable element : elementsList) {
            element.toMarkdown(sb);
        }
        return sb;
    }
}
