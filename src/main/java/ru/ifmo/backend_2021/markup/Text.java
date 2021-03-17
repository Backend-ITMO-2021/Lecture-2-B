package ru.ifmo.backend_2021.markup;

public class Text implements Markdownable {
	private final String textElement;

	public Text(String text) {
		this.textElement = text;
	}

	@Override
	public StringBuilder toMarkdown(StringBuilder stringBuffer) {
		stringBuffer.append(textElement);

		return stringBuffer;
	}
	
}
