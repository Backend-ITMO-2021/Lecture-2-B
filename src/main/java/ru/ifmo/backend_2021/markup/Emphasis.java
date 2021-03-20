package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends toMarkdown{
    public Emphasis(List<Mark> list) {
        super(list, "*");
    }
}