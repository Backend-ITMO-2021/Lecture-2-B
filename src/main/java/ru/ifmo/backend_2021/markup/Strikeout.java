package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;

public class Strikeout extends MarkupGroup{

    public Strikeout(ArrayList<MarkupElement> parts) {
        super("~", parts);
    }

}
