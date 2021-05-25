package ru.ifmo.backend_2021.markup;

import java.util.List;

abstract class MarkdownBlock implements Block {
    protected List<Block> blocksList;
    protected final String mark;

    MarkdownBlock(List<Block> blocksList, String mark){
        this.blocksList = blocksList;
        this.mark = mark;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(this.mark);
        this.blocksList.forEach(block -> block.toMarkdown(stringBuilder));
        stringBuilder.append(this.mark);
        return stringBuilder;
    }
}
