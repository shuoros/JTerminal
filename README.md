![rsz_j4](https://user-images.githubusercontent.com/45015114/139809463-417377ca-2eef-4cec-9689-bd841b0ce5db.png)
#
**JTerminal** is an easy to use library for printing custom outouts on terminal.

## Hello Terminal
To use JTerminal you just need to make a static call to your desired API.

For example:

![Screenshot from یب11-01 22-18-31](https://user-images.githubusercontent.com/45015114/139813499-0b40be90-62d6-4f02-b771-4d47f0d66c16.png)

The above image was the result of running this piece of code:

```java
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;

public class Main {

	public static void main(String[] args) {
		JTerminal.print("Hello", Color.YELLOW);
		JTerminal.println("Terminal", Color.GREEN);
		JTerminal.print("i'm JTerminal", Color.ORANGE);
		JTerminal.println("!", Color.RED);
	}

}
```

To see color cheat sheet please check [color docs](https://github.com/shuoros/JTerminal/blob/main/doc/colors)

## Authors
JTerminal is developed by [Soroush Shemshadi](https://github.com/shuoros) and [contributors](https://github.com/shuoros/JTerminal/blob/main/CONTRIBUTORS.md).

## Contribution
If you want to contribute on this project, Please read the [contribution guide](https://github.com/shuoros/JTerminal/blob/main/CONTRIBUTE.md).

## Releases
To see the changes in different versions of JTerminal, you can read the [release notes](https://github.com/shuoros/JTerminal/blob/main/RELEASENOTES.md).

## Issues
If you encounter a bug or vulnerability, please read the [issue policy](https://github.com/shuoros/JTerminal/blob/main/ISSUES.md).

## Documentation
To learn how to work with JTerminal, please take a look at the [/doc](https://github.com/shuoros/JTerminal/tree/main/doc) folder.
