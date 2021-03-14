package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Paragraph implements MarkUpInterface{
    private StringBuilder paragraph;

    public Paragraph(List<MarkUpInterface> list){
        this.paragraph = new StringBuilder("");
        for (MarkUpInterface item: list){
            this.paragraph = item.toMarkdown(this.paragraph);
        }
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb){
        return sb.append(this.paragraph);
    }
}

