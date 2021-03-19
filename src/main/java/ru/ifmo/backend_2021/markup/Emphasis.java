package main.java.ru.ifmo.backend_2021.markup;
import java.util.List;

public class Emphasis extends MarkDownElement {
    public Emphasis(List<TextElemet> elements) {
        super(elements);
        this.SYMBOL = "*";
    }
}
