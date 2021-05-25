package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph extends MarkdownBlock {
    public Paragraph(List<Block> blocksList){
        super(blocksList, "");
    }
}
