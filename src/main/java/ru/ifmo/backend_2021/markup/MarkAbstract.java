package ru.ifmo.backend_2021.markup;


import java.util.List;

public abstract class MarkAbstract implements MarkDown {

    private List<MarkDown> markDownList;

    private final String MARK;

    MarkAbstract(List<MarkDown> markDownList, String mark) {
        this.markDownList = markDownList;
        MARK = mark;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder builder) {
        if(markDownList == null){
            return builder;
        }
        builder.append(MARK);
        markDownList.forEach(markDown -> {
            markDown.toMarkdown(builder);
        });
        builder.append(MARK);
        return builder;
    }

}
