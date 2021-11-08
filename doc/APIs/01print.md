# Print And Println

To print or println your string on terminal, You can make a static call to JTerminal print and println API.

## `print(String string)
It's print out your string on terminal with JTerminals default foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!");
	}

}
```

#### Implementation

```java
/**
* Prints your given string on terminal with default foreground and background
* color.
* 
* @param string : A string that you want to print on terminal.
*/
public static void print(String string) {
	System.out.print(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity())));
}
```

## `println(String string)`
It's print out your string on terminal with end line and JTerminals default foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Hello!");
	}

}
```

#### Implementation

```java
/**
* Prints your given string with end line on terminal with default foreground
* and background color.
* 
* @param string : A string you want to print on terminal.
*/
public static void println(String string) {
	System.out.println(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity())));
}
```

## `print(String string, , List<TextEntity> textEnitities)`
It's print out your string on terminal with your given list of entities.

Read more about [TextEntity](https://github.com/shuoros/JTerminal/blob/main/doc/Utils/00textEntity.md)

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!", List.of(//
				new TextEntity(Color.ORANGE));
	}

}
```

#### Implementation

```java
/**
* Prints your given string on terminal with list of your
* {@link io.github.shuoros.jterminal.util.TextEntity}s.
* 
* @param string        : A string you want to print on termina
* @param textEnitities : A List of
*                      {@link io.github.shuoros.jterminal.util.TextEntity}
*                      which each of them can contain setting for a range of
*                      your given string.
*/
public static void print(String string, List<TextEntity> textEnitities) {
	System.out.print(//
			AnsiUtils.generateCode(//
					string, textEnitities));
}
```

## `println(String string, , List<TextEntity> textEnitities)`
It's print out your string on terminal with end line and your given list of entities.

Read more about [TextEntity](https://github.com/shuoros/JTerminal/blob/main/doc/Utils/00textEntity.md)

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Hello!", List.of(//
				new TextEntity(Color.ORANGE));
	}

}
```

#### Implementation

```java
/**
* Prints your given string with end line on terminal list of your
* {@link io.github.shuoros.jterminal.util.TextEntity}s.
* 
* @param string        : A string you want to print on termina
* @param textEnitities : A List of
*                      {@link io.github.shuoros.jterminal.util.TextEntity}
*                      which each of them can contain setting for a range of
*                      your given string.
*/
public static void println(String string, List<TextEntity> textEnitities) {
	System.out.println(//
			AnsiUtils.generateCode(//
					string, textEnitities));
}
```

## `print(String string, Color foreground)`
It's print out your string on terminal with your given foreground color and JTerminals default background color.

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!", Color.ORANGE);
	}

}
```

#### Implementation

```java
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
}
```

## `println(String string, Color foreground)`
It's print out your string on terminal with end line and your given foreground color and JTerminals default background color.

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Hello!", Color.ORANGE);
	}

}
```

#### Implementation

```java
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
		System.out.println(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground))));
}
```

## `print(String string, Color foreground, Color background)`
It's print out your string on terminal with your given foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!", Color.ORANGE, Color.GREEN);
	}

}
```

#### Implementation

```java
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
}
```

## `println(String string, Color foreground, Color background)`
It's print out your string on terminal with end line and your given foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Hello!", Color.ORANGE, Color.GREEN);
	}

}
```

#### Implementation

```java
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
	System.out.println(//
				AnsiUtils.generateCode(//
						string, List.of(new TextEntity(foreground, background))));
}
```
