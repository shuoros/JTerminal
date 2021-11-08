# TextEntity

TextEntity is a model to represent entity of a given text to generate ANSI code based on that entities.

In TextEntity you can define the range of your entity on text and then set the foreground and background color for the selected range.

Example:

```java
import java.util.List;

import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.TextEntity;

public class Main {

	public static void main(String[] args) {
		JTerminal.println(">JTerminal:~ 1.0.0", List.of(//
				new TextEntity(0, 1, Color.DARK_SEA_GREEN_7), //
				new TextEntity(1, 10, Color.ORANGE), //
				new TextEntity(10, 12, Color.DARK_SEA_GREEN_7), //
				new TextEntity(12, 18, Color.WHITE)));
	}

}
```

**Please consider that ranges must not overlap and for now give your list of entities in order of ranges and you must cover all of your string with TextEnity/TextEnities(0 -> text.length()). this shortcomes (ranges order and full coverage) will be solve in next versions.**