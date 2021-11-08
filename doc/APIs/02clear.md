# Clear

To clear terminal, You can make a static call to JTerminal clear API.

## `clear()`
It's clears whole terminal.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Screen must clear");
		JTerminal.clear();
	}

}
```

#### Implementation

```java
/**
* Clear the terminal.
*/
public static void clear() {
	System.out.print("\033\143");
}
```

## `clear(long sleep)`
It's clears whole terminal after sleep in `long sleep` seconds.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("Screen must clear after one second");
		JTerminal.clear(1000);
	}

}
```

#### Implementation

```java
/**
* Call the {@code clear()} after sleep for {@code sleep} milliseconds.
* 
* @param sleep : Sleep time in milliseconds.
*/
public static void clear(long sleep) {
	try {
		Thread.sleep(sleep);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	clear();
}
```