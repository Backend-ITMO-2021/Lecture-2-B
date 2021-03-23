package ru.ifmo.backend_2021.markup;
import java.util.List;

public class MarkDownElement implements TextElemet {
    protected String SYMBOL;
    private List<TextElemet> elements;

    MarkDownElement(List<TextElemet> elements) {
        this.elements = elements;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(SYMBOL);
        elements.forEach(element -> element.toMarkdown(sb));
        sb.append(SYMBOL);
        return sb;
    }
}