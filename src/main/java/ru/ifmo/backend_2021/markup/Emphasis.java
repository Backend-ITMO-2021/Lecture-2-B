package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkUp{

    public Emphasis(List<MarkUpInterface> list){
        super(list);
        this.setSymbol("*");
    }
}
