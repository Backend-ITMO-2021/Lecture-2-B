package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends MarkUp{
    public Strikeout(List<MarkUpInterface> list){
        super(list);
        this.setSymbol("~");
    }
}
