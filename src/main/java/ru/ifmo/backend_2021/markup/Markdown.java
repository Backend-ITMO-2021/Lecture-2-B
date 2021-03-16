package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class Markdown implements CustomMarkdown{
    private final List<CustomMarkdown> elems;
    private final String sign;

    public Markdown(List<CustomMarkdown> curElems, String curSing) {
        elems = curElems;
        sign = curSing;
    }

    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(sign);
        for (CustomMarkdown elem : elems) {
            elem.toMarkdown(output);
        }
        output.append(sign);
        return output;
    }





}
