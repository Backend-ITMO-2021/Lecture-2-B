
package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends Mark{
    public Strikeout(List<MarkDown> marksDown) {
        super(marksDown, "~");
    }
}