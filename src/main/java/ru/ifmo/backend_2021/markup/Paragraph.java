package ru.ifmo.backend_2021.markup;
import java.util.List;

public class Paragraph implements TextElemet {
    private List<TextElemet> elements;

    public Paragraph(List<TextElemet> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        elements.forEach(element -> element.toMarkdown(sb));
        return sb;
    }
}
