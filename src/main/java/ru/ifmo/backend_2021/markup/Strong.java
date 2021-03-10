package ru.ifmo.backend_2021.markup;


import java.util.List;

public class Strong extends MarkAbstract{

    public Strong(List<MarkDown> markDownList) {
        super(markDownList, "__");
    }

}
