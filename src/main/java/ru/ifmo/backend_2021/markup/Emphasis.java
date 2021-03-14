package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkDownElement {
    public Emphasis(List<Markable> textElements) {
        super(textElements);
        this.SYMBOL = "*";
    }
}
