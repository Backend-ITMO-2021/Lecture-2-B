package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends MarkDownElement {
    public Strong(List<Markable> textElements) {
        super(textElements);
        this.SYMBOL = "__";
    }
}
