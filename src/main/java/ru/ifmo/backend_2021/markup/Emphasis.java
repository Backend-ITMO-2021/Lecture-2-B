package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkupNode {
    private static final String SYMBOL = "*";

    @Override
    String getSymbol() {
        return SYMBOL;
    }

    public Emphasis(List<Markup> text) {
        super(text);
    }
}
