package ru.ifmo.backend_2021.markup;

public class Text implements Markdowns {
    private final String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder output) {
        output.append(text);

        return output;
    }
}
