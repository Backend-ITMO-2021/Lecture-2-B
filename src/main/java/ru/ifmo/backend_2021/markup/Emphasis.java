package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkAbstract implements MarkDown {

    public Emphasis(List<MarkDown> markDownList) {
        super(markDownList, "*");
    }

}
