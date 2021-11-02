# Print And Println
To print or println your string on terminal, You can make a static call to JTerminal print and println API.
## ‍‍‍`print(String string)‍‍`
It's print out your string‍‍‍‍ on terminal with JTerminals default foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello!");
	}

}
```

#### Implementation
First of all, the ANSI code of the default background and foreground color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET`.

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
			  Map.of("foreground", defaultForeground, "background", defaultBackground)));
	System.out.print(string);
	System.out.print(AnsiUtils.RESET);
}
```

## `println(String string)`
It's print out your string‍‍‍‍ on terminal with end line and JTerminals default foreground and background color.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Hello!");
	}

}
```

#### Implementation
First of all, the ANSI code of the default background and foreground color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET` and end line.

```java
/**
* Prints your given string with end line on terminal with default foreground
* and background color.
* 
* @param string : A string you want to print on terminal.
*/
public static void println(String string) {
	System.out.print(//
	    AnsiUtils.generateCode(//
			  Map.of("foreground", defaultForeground, "background", defaultBackground)));
	System.out.print(string);
	System.out.println(AnsiUtils.RESET);
}
```

## `print(String string, Color foreground)`
It's print out your string‍‍‍‍ on terminal with your given foreground color and JTerminals default background color.

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
First of all, the ANSI code of the default background and given foreground color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET`.

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
			  Map.of("foreground", foreground, "background", defaultBackground)));
	System.out.print(string);
	System.out.print(AnsiUtils.RESET);
}
```

## `println(String string, Color foreground)`
It's print out your string‍‍‍‍ on terminal with end line and your given foreground color and JTerminals default background color.

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
First of all, the ANSI code of the default background and given foreground color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET` and end line.

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
	System.out.print(//
	    AnsiUtils.generateCode(//
			  Map.of("foreground", foreground, "background", defaultBackground)));
	System.out.print(string);
	System.out.println(AnsiUtils.RESET);
}
```

## `print(String string, Color foreground, Color background)`
It's print out your string‍‍‍‍ on terminal with your given foreground and background color.

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
First of all, the ANSI code of given foreground and background color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET`.

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
			  Map.of("foreground", foreground, "background", background)));
	System.out.print(string);
	System.out.print(AnsiUtils.RESET);
}
```

## `println(String string, Color foreground, Color background)`
It's print out your string‍‍‍‍ on terminal with end line and your given foreground and background color.

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
First of all, the ANSI code of given foreground and background color are generate and print out using `AnsiUtils.generateCode`, Therefore, the next string that is sent to the terminal for printing has the desired colors. At the end terminal will be reset using ANSI reset escape code with `AnsiUtils.RESET` and end line.

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
	System.out.print(//
	    AnsiUtils.generateCode(//
			  Map.of("foreground", foreground, "background", background)));
	System.out.print(string);
	System.out.println(AnsiUtils.RESET);
}
```
