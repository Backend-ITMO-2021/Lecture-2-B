package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Text extends Paragraph{
    private StringBuilder text;
    public Text(String str) {
        super(List.of());
        this.text = new StringBuilder(str);
    }
    
    @Override
    public StringBuilder toMarkdown(StringBuilder strB) {
        strB.append(this.text);
        return strB;
    }
}
