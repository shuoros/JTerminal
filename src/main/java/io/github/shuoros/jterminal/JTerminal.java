package io.github.shuoros.jterminal;

import java.util.List;
import java.util.Map;

import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.AnsiUtils;

public class JTerminal {

	private static Color defaultForeground = Color.WHITE;
	private static Color defaultBackground = Color.BLACK;

	public static void print(String string) {
		System.out.print(//
				AnsiUtils.generateCode(//
						Map.of("foreground", defaultForeground, "background", defaultBackground)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

	public static void print(String string, Color foreground) {
		System.out.print(//
				AnsiUtils.generateCode(//
						Map.of("foreground", foreground, "background", defaultBackground)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

	public static void print(String string, Color foreground, Color background) {
		System.out.print(//
				AnsiUtils.generateCode(//
						Map.of("foreground", foreground, "background", background)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

	public static void println(String string) {
		System.out.print(//
				AnsiUtils.generateCode(//
						Map.of("foreground", defaultForeground, "background", defaultBackground)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

	public static void println(String string, Color foreground) {
		System.out.print(//
				AnsiUtils.generateCode(//
						Map.of("foreground", foreground, "background", defaultBackground)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

	public static void println(String string, Color foreground, Color background) {
		System.out.print(//
				AnsiUtils.generateCode(Map.of(//
						"foreground", foreground, "background", background)));
		System.out.print(string);
		System.out.println(AnsiUtils.RESET);
	}

}
