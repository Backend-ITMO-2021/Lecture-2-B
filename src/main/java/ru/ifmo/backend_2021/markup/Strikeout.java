package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends MarkupNode {
    private static final String SYMBOL = "~";

    @Override
    String getSymbol() {
        return SYMBOL;
    }

    public Strikeout(List<Markup> text) {
        super(text);
    }
}
