package io.github.shuoros.jterminal;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.AnsiUtils;
import io.github.shuoros.jterminal.util.TextEntity;

/**
 * A library for printing custom outputs in terminal by Java.
 * 
 * @author Soroush Shemshadi
 * @see <a href="https://shuoros.github.io/jterminal">JTerminal</a>
 * @version 0.1.1
 * @since 0.1.0
 * 
 */
public class JTerminal {

	/**
	 * Default text foreground color.
	 */
	private static Color defaultForeground = Color.DEFAULT;

	/**
	 * Default text background color.
	 */
	private static Color defaultBackground = Color.DEFAULT;

	/**
	 * Getter of default foreground.
	 * 
	 * @return Default foreground
	 */
	public static Color getDefaultForeground() {
		return defaultForeground;
	}

	/**
	 * Setter of default foreground.
	 * 
	 * @param defaultForeground : Your desired
	 *                          {@link io.github.shuoros.jterminal.ansi.Color} for
	 *                          JTerminal default foreground color.
	 */
	public static void setDefaultForeground(Color defaultForeground) {
		JTerminal.defaultForeground = defaultForeground;
	}

	/**
	 * Getter of default background.
	 * 
	 * @return Default background
	 */
	public static Color getDefaultBackground() {
		return defaultBackground;
	}

	/**
	 * Setter of default background.
	 * 
	 * @param defaultBackground : Your desired
	 *                          {@link io.github.shuoros.jterminal.ansi.Color} for
	 *                          JTerminal default background color.
	 */
	public static void setDefaultBackground(Color defaultBackground) {
		JTerminal.defaultBackground = defaultBackground;
	}

	/**
	 * Prints your given string on terminal with default foreground and background
	 * color.
	 * 
	 * @param string : A string you want to print on terminal.
	 */
	public static void print(String string) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity())));
		System.out.print(AnsiUtils.RESET);
	}

	public static void print(String string, List<TextEntity> textEnitities) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, textEnitities));
		System.out.print(AnsiUtils.RESET);
	}

	/**
	 * Prints your given string on terminal with your given foreground color and
	 * default background color. Eventually your given foreground color will be
	 * reset to the default foreground color.
	 * 
	 * @param string     : A string that you want to print on terminal.
	 * @param foreground : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit it on terminal.
	 */
	public static void print(String string, Color foreground) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground))));
		System.out.print(AnsiUtils.RESET);
	}

	/**
	 * Prints your given string on terminal with your given foreground color and
	 * background color. Eventually your given foreground and background colors will
	 * be reset to the default foreground and background colors.
	 * 
	 * @param string     : A string that you want to print on terminal.
	 * @param foreground : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit that foreground color on
	 *                   terminal.
	 * @param background : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit that background color on
	 *                   terminal.
	 */
	public static void print(String string, Color foreground, Color background) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground, background))));
		System.out.print(AnsiUtils.RESET);
	}

	/**
	 * Prints your given string with end line on terminal with default foreground
	 * and background color.
	 * 
	 * @param string : A string you want to print on terminal.
	 */
	public static void println(String string) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity())));
		System.out.println(AnsiUtils.RESET);
	}

	public static void println(String string, List<TextEntity> textEnitities) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, textEnitities));
		System.out.println(AnsiUtils.RESET);
	}

	/**
	 * Prints your given string with end line on terminal with your given foreground
	 * color and default background color. Eventually your given foreground color
	 * will be reset to the default foreground color.
	 * 
	 * @param string     : A string that you want to print on terminal.
	 * @param foreground : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit it on terminal.
	 */
	public static void println(String string, Color foreground) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground))));
		System.out.println(AnsiUtils.RESET);
	}

	/**
	 * Prints your given string with end line on terminal with your given foreground
	 * color and background color. Eventually your given foreground and background
	 * colors will be reset to the default foreground and background colors.
	 * 
	 * @param string     : A string that you want to print on terminal.
	 * @param foreground : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit that foreground color on
	 *                   terminal.
	 * @param background : A {@link io.github.shuoros.jterminal.ansi.Color} that you
	 *                   want print your string whit that background color on
	 *                   terminal.
	 */
	public static void println(String string, Color foreground, Color background) {
		System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground, background))));
		System.out.println(AnsiUtils.RESET);
	}

	/**
	 * Clear the screen. If {@code OS} was windows then the {@code cls} command will
	 * be execute and else {@code "\033\143"} will be printed in terminal to clear
	 * the screen.
	 */
	public static void clear() {
		System.out.print("\033\143");
	}

	/**
	 * Call the {@code clear()} after sleep for {@code sleep} milliseconds.
	 * 
	 * @param sleep Sleep time in milliseconds.
	 */
	public static void clear(long sleep) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clear();
	}

	public static void delete() {
		int line = 1;
		System.out.print(String.format("\033[%dA", line)); // Move up
		System.out.print("\033[2K"); // Erase line content
	}

	public static void delete(int line) {
		System.out.print(String.format("\033[%dA", line)); // Move up
		System.out.print("\033[2K"); // Erase line content
	}

}
