package io.github.shuoros.jterminal.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

import io.github.shuoros.jterminal.ansi.Attribute;
import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.AnsiUtils;
import io.github.shuoros.jterminal.util.TextEntity;

public class AnsiUtilsTest {

	@Test
	public void generatedAnsiCodeMustInOrderOfTextEntitiesRanges() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(2, 4, Color.RED), //
				new TextEntity(0, 2, Color.ORANGE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(generatedAnsiCode.indexOf("te") < generatedAnsiCode.indexOf("st"));
	}

	@Test
	public void generatedAnsiCodeMustHaveFullCoverageOfStringWithoutFullCoverageOfTextEntity() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(0, 2, Color.ORANGE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertEquals(2, generatedAnsiCode.split(AnsiUtils.RESET.replaceAll("\\[", "\\\\[")).length); // Color just
																										// assigned to
																										// range of 0 to
																										// 2. We must
																										// asure that
																										// range 2 to 4
																										// is exist with
																										// default
																										// colotr too.
	}

	@Test
	public void mustThrowExceptionIfDetectOverlapInEntities() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(0, 2, Color.WHITE), //
				new TextEntity(1, 4, Color.RED));

		// When
		Exception exception = assertThrows(RuntimeException.class, () -> {
			AnsiUtils.generateCode(text, enitities);
		});

		// Then
		assertTrue(exception.getMessage().contains("Entities ranges must not have overlap"));
	}

	@Test
	public void generatedAnsiCodeMustStartsWithAnsiEscapeCode() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(Color.WHITE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(generatedAnsiCode.startsWith("\u001B["));
	}

	@Test
	public void generatedAnsiCodeMustResetItsAttributes() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(Color.WHITE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(generatedAnsiCode.endsWith(AnsiUtils.RESET));
	}

	@Test
	public void generatedAnsiCodeMustNotHaveSeparatorBeforePostfix() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(Color.WHITE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(!generatedAnsiCode.contains(";" + "m"));
	}

	@Test
	public void generatedAnsiCodeMustHaveResetAfterEachEntity() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(0, 2, Color.WHITE), //
				new TextEntity(2, 4, Color.RED));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertEquals(2, generatedAnsiCode.split(AnsiUtils.RESET.replaceAll("\\[", "\\\\[")).length); // replace all [
																										// with \[ to
																										// avoid regex
																										// exception
	}

	@Test
	public void generatedAnsiCodeMustHaveForegroundEscapeCodeForForegroundColor() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(Color.WHITE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(generatedAnsiCode.contains(Attribute.FOREGROUND.toString() + Color.WHITE.toString()));
	}

	@Test
	public void generatedAnsiCodeMustHaveBackgroundEscapeCodeForBackgroundColor() {
		// Givven
		String text = "test";
		List<TextEntity> enitities = List.of(//
				new TextEntity(Color.WHITE, Color.WHITE));

		// When
		String generatedAnsiCode = AnsiUtils.generateCode(text, enitities);

		// Then
		assertTrue(generatedAnsiCode.contains(Attribute.BACKGROUND.toString() + Color.WHITE.toString()));
	}

}
