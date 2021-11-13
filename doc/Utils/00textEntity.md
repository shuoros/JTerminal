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
				new TextEntity(1, 10, Color.ORANGE), //
				new TextEntity(0, 1, Color.DARK_SEA_GREEN_7), //
				new TextEntity(10, 12, Color.DARK_SEA_GREEN_7)));
	}

}
```

You can create the list of TextEntities with no range order And it's not necessary to cover all of your text with entities, The uncovered part of text will be print with default foreground and background colors. 