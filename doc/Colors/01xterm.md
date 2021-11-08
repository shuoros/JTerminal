# Xterm Colors

To use colors by theire XTerm code you can call `xterm()` method in Color and give it XTerm code of color you want:

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!", Color.xTerm(214);
	}

}
```

**The printed "Hello!" will have orange foreground.**