package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends MarkUp{

    public Strong(List<MarkUpInterface> list){
        super(list);
        this.setSymbol("__");
    }
}
