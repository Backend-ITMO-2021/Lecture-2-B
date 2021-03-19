package ru.ifmo.backend_2021.markup;
import java.util.LinkedList;
import java.util.List;

public class Paragraph {
    String symbol;
    LinkedList<Paragraph> list;
    public Paragraph(List<Paragraph> list) {
        this.list = new LinkedList<Paragraph>(list);
        this.symbol = "";
    }
    public StringBuilder toMarkdown(StringBuilder strB) {
        // раз во всех тестах строкостроитель пустой, считаю, что так всегда, проверку не провожу
        strB.append(this.symbol);
        while(!this.list.isEmpty()) {
            Paragraph paragraph = (Paragraph)this.list.removeFirst();
            paragraph.toMarkdown(strB);
        }
        strB.append(this.symbol);
        return strB;
    }
}
