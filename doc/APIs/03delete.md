# Delete

To delete line or lines in terminal, You can make a static call to JTerminal delete API.

## `delete()`
It deletes one line before cursor.

```java
import io.github.shuoros.jterminal.JTerminal;

public class Main {

	public static void main(String[] args) {
		JTerminal.println("The line below must be deleted after one second");
		JTerminal.println("I should be deleted in a second");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JTerminal.delete();
	}

}
```

#### Implementation

```java
/**
* Deletes the last line befour cursor.
*/
public static void delete() {
	int line = 1;
	System.out.print(String.format("\033[%dA", line)); // Move up
	System.out.print("\033[2K"); // Erase line content
}
```

## `delete(int line)`
it deletes `int line` lines before cursor.

public class Main {

	public static void main(String[] args) {
		JTerminal.println("The line below and I must be deleted after one second");
		JTerminal.println("I should be deleted in a second");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JTerminal.delete(2);
	}

}
```

#### Implementation

```java
/**
* Delete last given {@code line}s befour cursor.
* 
* @param line : Lines number you want to delete.
*/
public static void delete(int line) {
	System.out.print(String.format("\033[%dA", line)); // Move up
	System.out.print("\033[2K"); // Erase line content
}
```