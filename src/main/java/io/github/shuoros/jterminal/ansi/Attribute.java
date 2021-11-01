package io.github.shuoros.jterminal.ansi;

public enum Attribute {

	CLEAR("0"), // CLEAR
	FOREGROUND("38;5;"), // TEXT FOREGROUND
	BACKGROUND("48;5;"); // TEXT BACKGROUND

	private String code;

	Attribute(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

}
