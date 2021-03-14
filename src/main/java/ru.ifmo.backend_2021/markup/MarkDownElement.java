package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class MarkDownElement implements Markable {
    protected String SYMBOL;
    private final List<Markable> elementsList;

    public MarkDownElement(List<Markable> elementsList) {
        this.elementsList = elementsList;
    }

    @Override
    public StringBuilder toMarkDown(StringBuilder sb) {
        sb.append(SYMBOL);
        for (Markable element : elementsList) {
            element.toMarkDown(sb);
        }
        sb.append(SYMBOL);

        return sb;
    }
}
