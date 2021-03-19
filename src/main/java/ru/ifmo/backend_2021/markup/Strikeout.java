package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends Paragraph {
    public Strikeout(List<Paragraph> list) {
        super(list);
        this.symbol = "~";
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder strB) {
        super.toMarkdown(strB);
        return strB;
    }
}
