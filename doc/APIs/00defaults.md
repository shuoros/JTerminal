# Defaults
You can change the default attributes of JTerminal by calling theire static setters.

## Default foreground
To change default foreground color of JTerminal you can make a static call to foreground setter. 

For example:

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.setDefaultForeground(Color.ORANGE);
		JTerminal.print("Hello!");
	}

}
```

**The printed "Hello!" will have orange foreground.**

## Default background
To change default background color of JTerminal you can make a static call to background setter. 

For example:

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.setDefaultBackground(Color.GREEN);
		JTerminal.print("Hello!");
	}

}
```

**The printed "Hello!" will have green background.**
