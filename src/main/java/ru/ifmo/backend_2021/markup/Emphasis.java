package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkupGroup{

    public Emphasis(List<MarkupElement> parts) {
        super("*", parts);
    }
}
