package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;

public class Emphasis extends MarkupGroup{

    public Emphasis(ArrayList<MarkupElement> parts) {
        super("*", parts);
    }
}
