package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends MarkdownBlock {
    public Strong(List<Block> blocksList){
        super(blocksList, "__");
    }
}
