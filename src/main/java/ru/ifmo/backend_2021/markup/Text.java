package ru.ifmo.backend_2021.markup;


public class Text implements MarkDown{
    private String text;

    public Text(String text){
        this.text = text;
    }


    public StringBuilder toMarkdown(StringBuilder sB) {
        sB.append(text);
        return sB;
    }
}
