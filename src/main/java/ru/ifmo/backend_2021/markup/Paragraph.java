package ru.ifmo.backend_2021.markup;

import java.util.List;

/**
 * Paragraph
 */
public class Paragraph implements Markdownable {

	private final List<Markdownable> innerElements;


	public Paragraph(List<Markdownable> inputElements) {
		this.innerElements = inputElements;
	}

	@Override
	public StringBuilder toMarkdown(StringBuilder stringBuffer) {
		for (Markdownable innerElement : this.innerElements) {
			innerElement.toMarkdown(stringBuffer);
		}

		return stringBuffer;
	}


}