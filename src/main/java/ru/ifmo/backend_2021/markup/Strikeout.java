package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends MarkupGroup{

    public Strikeout(List<MarkupElement> parts) {
        super("~", parts);
    }

}
