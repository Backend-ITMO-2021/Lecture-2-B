
package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends Mark {
    public Emphasis(List<Markup> markDowns) {
        super(markDowns, "*");
    }
}