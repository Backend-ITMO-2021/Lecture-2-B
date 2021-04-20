package ru.ifmo.backend_2021.markup;

public class Text implements MarkdownElement {
    String text;

    public Text(String text) { //Конструкторы.
        this.text = text;
    }

    public Text() {
        this.text = "";
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder str) {
        str.append(text);
        return str;
    }
}
