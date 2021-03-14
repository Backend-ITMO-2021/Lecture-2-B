package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends MarkDownElement {
    public Strikeout(List<Markable> textElements) {
        super(textElements);
        this.SYMBOL = "~";
    }
}
