package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Emphasis extends MarkdownBlock {
    public Emphasis(List<Block> blocksList){
        super(blocksList, "*");
    }
}
