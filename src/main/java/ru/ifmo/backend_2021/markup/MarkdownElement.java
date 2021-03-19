package ru.ifmo.backend_2021.markup;

public interface MarkdownElement {

    StringBuilder toMarkdown(StringBuilder buffer);
}
