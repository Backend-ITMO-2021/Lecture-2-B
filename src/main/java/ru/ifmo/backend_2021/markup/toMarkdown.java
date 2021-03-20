package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class toMarkdown implements Mark{
    private final List<Mark> list;
    private final String symbol;

    public toMarkdown(List<Mark> list, String symbol) {
        this.list = list;
        this.symbol = symbol;
    }

    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(this.symbol);
        for (Mark element : list) {
            element.toMarkdown(output);
        }
        output.append(this.symbol);
        return output;
    }
}