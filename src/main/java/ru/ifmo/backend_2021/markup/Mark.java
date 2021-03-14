package ru.ifmo.backend_2021.markup;


import java.util.List;

public abstract class Mark implements MarkDown {

    private List<MarkDown> marksDown;

    private String mark;

    public Mark(List<MarkDown> markDownList, String mark) {
        this.marksDown = markDownList;
        this.mark = mark;
    }

    public StringBuilder toMarkdown(StringBuilder sB) {
        sB.append(mark);
        marksDown.forEach(markDown ->markDown.toMarkdown(sB));
        sB.append(mark);
        return sB;
    }

}