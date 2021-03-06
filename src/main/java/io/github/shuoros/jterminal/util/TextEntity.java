package io.github.shuoros.jterminal.util;

import io.github.shuoros.jterminal.ansi.Color;

/**
 * Model of entity for texts. Contains begin and and for a given text and its
 * foreground and background colors.
 * 
 * @author Soroush Shemshadi
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class TextEntity {

	private int begin;
	private int end;
	private Color foreground;
	private Color background;

	public TextEntity(int begin, int end, Color foreground, Color background) {
		this.begin = begin;
		this.end = end;
		this.foreground = foreground;
		this.background = background;
	}

	public TextEntity(int begin, int end, Color foreground) {
		this(begin, end, foreground, Color.DEFAULT);
	}

	public TextEntity(Color foreground, Color background) {
		this(Integer.MIN_VALUE, Integer.MAX_VALUE, foreground, background);
	}

	public TextEntity(Color foreground) {
		this(Integer.MIN_VALUE, Integer.MAX_VALUE, foreground, Color.DEFAULT);
	}

	public TextEntity(int begin, int end) {
		this(begin, end, Color.DEFAULT, Color.DEFAULT);
	}

	public TextEntity() {
		this(Integer.MIN_VALUE, Integer.MAX_VALUE, Color.DEFAULT, Color.DEFAULT);
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	@Override
	public String toString() {
		return "TextEntity [start=" + begin + ", end=" + end + ", foreground=" + foreground + ", background="
				+ background + "]";
	}

}
