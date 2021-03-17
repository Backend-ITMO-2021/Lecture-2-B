package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strong implements Markdownable {

	private final List<Markdownable> innerElements;
	private static String SYMBOL = "__";


	public Strong(List<Markdownable> inputElements) {
		this.innerElements = inputElements;
	}

	@Override
	public StringBuilder toMarkdown(StringBuilder stringBuffer) {
		stringBuffer.append(SYMBOL);
		for (Markdownable innerElement : this.innerElements) {
			innerElement.toMarkdown(stringBuffer);
		}
		stringBuffer.append(SYMBOL);

		return stringBuffer;
	}
	
}
