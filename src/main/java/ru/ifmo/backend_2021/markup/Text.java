package ru.ifmo.backend_2021.markup;

public class Text extends MarkupElement{
    private String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        str.append(this.text);
        return str;
    }

}
