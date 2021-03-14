
package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong extends Mark {
    public Strong(List<MarkDown> marksDown) {
        super(marksDown, "__");
    }
}