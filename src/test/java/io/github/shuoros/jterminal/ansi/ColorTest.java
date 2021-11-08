package io.github.shuoros.jterminal.ansi;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ColorTest {

	@Test
	public void mustThrowExceptionIfXTermCodeWasNotCorrect() {
		// Given
		int xTerm = 256; // 256 is out of range

		// When
		Exception exception = assertThrows(RuntimeException.class, () -> {
			Color.xTerm(xTerm);
		});

		// Then
		assertTrue(exception.getMessage().contains("XTerm code must be in range of 0 to 255"));
	}
}
