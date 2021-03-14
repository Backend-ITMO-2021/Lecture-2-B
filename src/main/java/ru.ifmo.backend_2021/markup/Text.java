package ru.ifmo.backend_2021.markup;

public class Text implements Markable {
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public StringBuilder toMarkDown(StringBuilder sb) {
        return sb.append(text);
    }
}
