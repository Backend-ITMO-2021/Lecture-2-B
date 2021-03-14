package ru.ifmo.backend_2021.markup;

public class Text implements Markdownable {
    private String value;

    public Text(String value) {
        this.value = value;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(value);
        return sb;
    }
}