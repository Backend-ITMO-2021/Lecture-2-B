package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class MarkDownElement implements Markable {
    protected String SYMBOL;
    private final List<Markable> elementsList;

    public MarkDownElement(List<Markable> elementsList) {
        this.elementsList = elementsList;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(SYMBOL);
        for (Markable element : elementsList) {
            element.toMarkdown(sb);
        }
        sb.append(SYMBOL);

        return sb;
    }
}
