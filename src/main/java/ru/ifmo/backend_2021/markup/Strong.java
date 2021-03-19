package main.java.ru.ifmo.backend_2021.markup;
import java.util.List;

public class Strong extends MarkDownElement {
    public Strong(List<TextElemet> elements) {
        super(elements);
        this.SYMBOL = "__";
    }
    
}
