package ru.ifmo.backend_2021.markup;
import java.util.List;

public class Strikeout extends ABCMarkdown{
    public Strikeout(List<Markdown> children, String mark) {
        super(children, mark);
    }
    public Strikeout(List<Markdown> children) {
        super(children, "~");
    }
}