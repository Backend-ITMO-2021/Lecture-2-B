package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends MarkupNode {
    private static final String SYMBOL  = "__";

    public Strong(List<Markup> text) {
        super(text);
    }

    @Override
    String getSymbol() {
        return SYMBOL;
    }
}
