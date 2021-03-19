package ru.ifmo.backend_2021.markup;

public class Text implements AbstractMarkdown {
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuild) {
        stringBuild.append(text);
        return stringBuild;
    }

}