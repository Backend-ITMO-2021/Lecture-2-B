package main.java.ru.ifmo.backend_2021.markup;

public class Text implements TextElemet {
    private String text;

    public Text(String str) {
        this.text = str;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(this.text);
        return sb;
    }
}
