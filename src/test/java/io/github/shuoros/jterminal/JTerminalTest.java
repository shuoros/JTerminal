package io.github.shuoros.jterminal;

import org.junit.jupiter.api.Disabled;

import com.sun.tools.javac.util.List;

import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.TextEntity;

public class JTerminalTest {

	/**
	 * Test methods of JTerminal
	 */
	@Disabled
	public void allMethodsMustWorksProperly() {
		// Clear screen with timer
		JTerminal.println("Screen must clear after one second");
		JTerminal.clear(1000);

		// Delete line
		JTerminal.println("The line below must be deleted after one second");
		JTerminal.println("I should be deleted in a second");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JTerminal.delete();
		JTerminal.clear(1000);

		// Print with default foreground and background colors
		JTerminal.println("Hello I'm in your terminal's default foreground and background color");
		JTerminal.println("\n");

		// Print with foreground or background color
		JTerminal.println("I'm an orange text with default background", Color.ORANGE);
		JTerminal.println("I'm an orange text with white background", Color.ORANGE, Color.WHITE);
		JTerminal.println("\n");

		// Use custom XTerm code
		JTerminal.println("I'm printed with 201 XTerm code", Color.xTerm(201));
		JTerminal.println("\n");

		// Print with TextEntity
		JTerminal.println("My colors were set with TextEntity", List.of(//
				new TextEntity(0, 24, Color.BLUE), //
				new TextEntity(24, 33, Color.YELLOW, Color.RED)));
		JTerminal.println("\n");

		// All suppoerted XTerm colors (8-bit 0-255)
		JTerminal.println("All suppoerted XTerm colors (8-bit 0-255) ->", List.of(//
				new TextEntity(0, 27, Color.WHITE), //
				new TextEntity(27, 42, Color.RED), //
				new TextEntity(42, 44, Color.WHITE, Color.ORANGE)));
		JTerminal.println("");
		for (Color color : Color.values()) {
			JTerminal.print(color.toString(), color);
			JTerminal.print(" ");
		}
		JTerminal.println("\n");

		// Credits
		JTerminal.println(">JTerminal:~ 1.0.0", List.of(//
				new TextEntity(0, 1, Color.DARK_SEA_GREEN_7), //
				new TextEntity(1, 10, Color.ORANGE), //
				new TextEntity(10, 12, Color.DARK_SEA_GREEN_7), //
				new TextEntity(12, 18, Color.WHITE)));
		JTerminal.println("By Soroush Shemshadi", Color.ORANGE);

	}

}
