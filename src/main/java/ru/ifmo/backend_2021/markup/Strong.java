package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends Paragraph {
    public Strong(List<Paragraph> list) {
        super(list);
        this.symbol = "__";
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder strB) {
        super.toMarkdown(strB);
        return strB;
    }
}
