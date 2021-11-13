<p align="center">
 <img src="https://user-images.githubusercontent.com/45015114/139809463-417377ca-2eef-4cec-9689-bd841b0ce5db.png" align="center" alt="JTerminal" />
 <h2 align="center">JTerminal</h2>
 <p align="center">Is an easy to use library for printing custom outouts on terminal!</p>
</p>
  <p align="center">
    <a href="https://mvnrepository.com/artifact/io.github.shuoros/JTerminal">
      <img src="https://img.shields.io/maven-central/v/io.github.shuoros/JTerminal?style=for-the-badge" />
    </a>
    <a href="#">
      <img src="https://img.shields.io/tokei/lines/github/shuoros/jterminal?style=for-the-badge" />
    </a>
    <a href="https://www.codefactor.io/repository/github/shuoros/jterminal">
      <img alt="code factor" src="https://img.shields.io/codefactor/grade/github/shuoros/jterminal/main?style=for-the-badge" />
    </a>
    <a href="https://github.com/anuraghazra/github-readme-stats/issues">
      <img alt="Contributors" src="https://img.shields.io/github/contributors/shuoros/jterminal?style=for-the-badge&color=blueviolet" />
    </a>
    <a href="https://github.com/shuoros/JTerminal/blob/main/LICENSE">
      <img alt="License" src="https://img.shields.io/github/license/shuoros/jterminal?style=for-the-badge" />
    </a>
    <br />
    <br />
    <a href="https://github.com/shuoros/JTerminal/issues">
      <img src="https://img.shields.io/github/issues-raw/shuoros/jterminal?style=for-the-badge&color=red"/>
    </a>
    <a href="https://github.com/shuoros/JTerminal/issues">
      <img src="https://img.shields.io/github/issues-closed-raw/shuoros/jterminal?style=for-the-badge"/>
    </a>
  </p>
  <p align="center">
	If you like this project, help me by giving me a star =))<3
  </p>

## What is in V1.0.2
- Print and println with foreground and background color.
- Support 8-bit 0-255 XTerm colors.
- Get colors by name and theire XTerm code.
- TextEntity class for assign different styles to a single string.
- Pass your TextEntity list with no order and full coverage (v1.0.2)
- clear the terminal.
- delete lines.

## Hello Terminal
To use JTerminal you just need to make a static call to your desired API.

For example:

![ezgif com-gif-maker](https://user-images.githubusercontent.com/45015114/140813186-1326fb9b-decc-4182-bf3c-19a4b0e04c24.gif)

The above gif was the result of running this piece of code:

```java
import java.util.List;

import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.util.TextEntity;

public class Main {

	public static void main(String[] args) {
		// Clear screen with timer
		JTerminal.println("Screen must clear after one second");
		JTerminal.clear(1000);

		// Delete line
		JTerminal.println("The line below must be deleted after one second");
		JTerminal.println("I should be deleted in a second");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JTerminal.delete();
		JTerminal.clear(1000);
		
		// Print with default foreground and background colors
		JTerminal.println("Hello I'm in your terminal's default foreground and background color");
		JTerminal.println("\n");

		// Print with foreground or background color
		JTerminal.println("I'm an orange text with default background", Color.ORANGE);
		JTerminal.println("I'm an orange text with white background", Color.ORANGE, Color.WHITE);
		JTerminal.println("\n");

		// Use custom XTerm code
		JTerminal.println("I'm printed with 201 XTerm code", Color.xTerm(201));
		JTerminal.println("\n");

		// Print with TextEntity
		JTerminal.println("My colors were set with TextEntity", List.of(//
				new TextEntity(0, 24, Color.BLUE), //
				new TextEntity(24, 33, Color.YELLOW, Color.RED)));
		JTerminal.println("\n");

		// All suppoerted XTerm colors (8-bit 0-255)
		JTerminal.println("All suppoerted XTerm colors (8-bit 0-255) ->", List.of(//
				new TextEntity(0, 27, Color.WHITE), //
				new TextEntity(27, 42, Color.RED), //
				new TextEntity(42, 44, Color.WHITE, Color.ORANGE)));
		JTerminal.println("");
		for (Color color : Color.values()) {
			JTerminal.print(color.toString(), color);
			JTerminal.print(" ");
		}
		JTerminal.println("\n");

		// Credits
		JTerminal.println(">JTerminal:~ 1.0.0", List.of(//
				new TextEntity(0, 1, Color.DARK_SEA_GREEN_7), //
				new TextEntity(1, 10, Color.ORANGE), //
				new TextEntity(10, 12, Color.DARK_SEA_GREEN_7), //
				new TextEntity(12, 18, Color.WHITE)));
		JTerminal.println("By Soroush Shemshadi", Color.ORANGE);
	}

}
```

#### To see color cheat sheet please check [docs](https://github.com/shuoros/JTerminal/blob/main/doc).

## Installation
You can use **JTerminal** with any project management tool:

### Maven

```xml
<!-- https://mvnrepository.com/artifact/io.github.shuoros/JTerminal -->
<dependency>
    <groupId>io.github.shuoros</groupId>
    <artifactId>JTerminal</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```gradle
// https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
implementation group: 'io.github.shuoros', name: 'JTerminal', version: '1.0.0'
```
Or

```gradle
// https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
implementation 'io.github.shuoros:JTerminal:1.0.0'
```

And in **Kotlin**

```gradle
// https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
implementation("io.github.shuoros:JTerminal:1.0.0")
```

### SBT

```sbt
// https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
libraryDependencies += "io.github.shuoros" % "JTerminal" % "1.0.0"
```

### Ivy

```xml
<!-- https://mvnrepository.com/artifact/io.github.shuoros/JTerminal -->
<dependency org="io.github.shuoros" name="JTerminal" rev="1.0.0"/>
```

### Grape

```java
// https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
@Grapes(
    @Grab(group='io.github.shuoros', module='JTerminal', version='1.0.0')
)
```

### Leiningen

```clj
;; https://mvnrepository.com/artifact/io.github.shuoros/JTerminal
[io.github.shuoros/JTerminal "1.0.0"]
```

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

## Acknowledgement
A greate thanks to [@sarahrajabi](https://github.com/sarahrajabi) for designing the logo.
