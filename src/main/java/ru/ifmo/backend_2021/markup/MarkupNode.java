package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class MarkupNode extends Markup {
    protected final List<Markup> text;

    abstract String getSymbol();

    public MarkupNode(List<Markup> text) {
        this.text = text;
    }

    @Override
    StringBuilder toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(getSymbol());
        text.forEach(markup -> markup.toMarkdown(stringBuilder));
        stringBuilder.append(getSymbol());
        return stringBuilder;
    }
}
