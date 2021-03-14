package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class MarkUp implements MarkUpInterface{
    private StringBuilder text;
    private String symbol = "";

    public MarkUp(List<MarkUpInterface> list){
        this.text = new StringBuilder("");
        for (MarkUpInterface item: list){
            this.text = item.toMarkdown(this.text);
        }
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getText() {
        return text.toString();
    }

    public StringBuilder toMarkdown(StringBuilder sb){
        return sb.append(this.symbol).append(this.text).append(this.symbol);
    }
}
