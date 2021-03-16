package ru.ifmo.backend_2021.markup;

import java.util.List;

abstract class Markdown implements MarkdownInterface{
    private List<MarkdownInterface> elements;
    private String sign;

    public Markdown(List<MarkdownInterface> elements, String sign) {
        this.elements = elements;
        this.sign = sign;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(sign);
        for (int i = 0; i < this.elements.size(); i++) {
            this.elements.get(i).toMarkdown(stringBuilder);
        }
        stringBuilder.append(sign);
        return stringBuilder;
    }

}