package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Text implements MarkUpInterface {
    private String text;

    public Text(String string){
        this.text = string;
    }

    public Text(){
        this("");
    }

    public StringBuilder toMarkdown(StringBuilder sb){
        return sb.append(this.text);
    }
}
