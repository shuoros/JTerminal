package io.github.shuoros.jterminal.ansi;

/**
 * Enumeration of ANSI 8-bit colors.
 * 
 * @author Soroush Shemshadi
 * @see <a href= "https://jonasjacek.github.io/colors/">256 COLORS - CHEAT
 *      SHEET</a>
 * @see <a href=
 *      "https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences/33206814#33206814">StackOverflow,
 *      for a list of codes with examples</a>
 * @version 0.1.1
 * @since 0.1.0
 *
 */
public enum Color {

	/**
	 * {@code Black - 	Xterm:0 - HEX:#000000 - RGB:0,0,0}
	 */
	BLACK("0"),
	/**
	 * {@code Maroon - 	Xterm:1 - HEX:#800000 - RGB:128,0,0}
	 */
	MAROON("1"),
	/**
	 * {@code Green - 	Xterm:2 - HEX:#008000 - RGB:0,128,0}
	 */
	GREEN("2"),
	/**
	 * {@code Olive - 	Xterm:3 - HEX:#808000 - RGB:128,128,0}
	 */
	OLIVE("3"),
	/**
	 * {@code Navy - 	Xterm:4 - HEX:#000080 - RGB:0,0,128}
	 */
	NAVY("4"),
	/**
	 * {@code Purple - 	Xterm:5 - HEX:#800080 - RGB:128,0,128}
	 */
	PURPLE("5"),
	/**
	 * {@code Teal - 	Xterm:6 - HEX:#008080 - RGB:0,128,128}
	 */
	TEAL("6"),
	/**
	 * {@code Silver - 	Xterm:7 - HEX:#c0c0c0 - RGB:192,192,192}
	 */
	SILVER("7"),
	/**
	 * {@code Grey - 	Xterm:8 - HEX:#808080 - RGB:128,128,128}
	 */
	GREY("8"),
	/**
	 * {@code Red - 	Xterm:9 - HEX:#ff0000 - RGB:255,0,0}
	 */
	RED("9"),
	/**
	 * {@code Lime - 	Xterm:10 - HEX:#00ff00 - RGB:0,255,0}
	 */
	LIME("10"),
	/**
	 * {@code Yellow - 	Xterm:11 - HEX:#ffff00 - RGB:255,255,0}
	 */
	YELLOW("11"),
	/**
	 * {@code Blue - 	Xterm:12 - HEX:#0000ff - RGB:0,0,255}
	 */
	BLUE("12"),
	/**
	 * {@code Fuchsia - 	Xterm:13 - HEX:#ff00ff - RGB:255,0,255}
	 */
	FUCHISA("13"),
	/**
	 * {@code Aqua - 	Xterm:14 - HEX:#00ffff - RGB:0,255,255}
	 */
	AQUA("14"),
	/**
	 * {@code White - 	Xterm:15 - HEX:#ffffff - RGB:255,255,255}
	 */
	WHITE("15"),
	/**
	 * {@code Grey0 - 	Xterm:16 - HEX:#000000 - RGB:0,0,0}
	 */
	GRAY_0("16"),
	/**
	 * {@code NavyBlue - 	Xterm:17 - HEX:#00005f - RGB:0,0,95}
	 */
	NAVY_BLUE("17"),
	/**
	 * {@code DarkBlue - 	Xterm:18 - HEX:#000087 - RGB:0,0,135}
	 */
	DARK_BLUE("18"),
	/**
	 * {@code Blue3 - 	Xterm:19 - HEX:#0000af - RGB:0,0,175}
	 */
	BLUE_3("19"),
	/**
	 * {@code Blue2 - 	Xterm:20 - HEX:#0000d7 - RGB:0,0,215}
	 */
	BLUE_2("20"),
	/**
	 * {@code Blue1 - 	Xterm:21 - HEX:#0000ff - RGB:0,0,255}
	 */
	BLUE_1("21"),
	/**
	 * {@code DarkGreen - 	Xterm:22 - HEX:#005f00 - RGB:0,95,0}
	 */
	DARK_GREEN("22"),
	/**
	 * {@code DeepSkyBlue6 - 	Xterm:23 - HEX:#005f5f - RGB:0,95,95}
	 */
	DEEP_SKY_BLUE_6("23"),
	/**
	 * {@code DeepSkyBlue5 - 	Xterm:24 - HEX:#005f87 - RGB:0,95,135}
	 */
	DEEP_SKY_BLUE_5("24"),
	/**
	 * {@code DeepSkyBlue4 - 	Xterm:25 - HEX:#005faf - RGB:0,95,175}
	 */
	DEEP_SKY_BLUE_4("25"),
	/**
	 * {@code DodgerBlue2 - 	Xterm:26 - HEX:#005fd7 - RGB:0,95,215}
	 */
	DODGER_BLUE_2("26"),
	/**
	 * {@code DodgerBlue1 - 	Xterm:27 - HEX:#005fff - RGB:0,95,255}
	 */
	DODGER_BLUE_1("27"),
	/**
	 * {@code Green4 - 	Xterm:28 - HEX:#008700 - RGB:0,135,0}
	 */
	GREEN_4("28"),
	/**
	 * {@code SpringGreen5 - 	Xterm:29 - HEX:#00875f - RGB:0,135,95}
	 */
	SPRING_GREEN_5("29"),
	/**
	 * {@code Turquoise1 - 	Xterm:30 - HEX:#008787 - RGB:0,135,135}
	 */
	TURQUOISE_1("30"),
	/**
	 * {@code DeepSkyBlue3 - 	Xterm:31 - HEX:#0087af - RGB:0,135,175}
	 */
	DEEP_SKY_BLUE_3("31"),
	/**
	 * {@code DeepSkyBlue2 - 	Xterm:32 - HEX:#0087d7 - RGB:0,135,215}
	 */
	DEEP_SKY_BLUE_2("32"),
	/**
	 * {@code DodgerBlue - 	Xterm:33 - HEX:#0087ff - RGB:0,135,255}
	 */
	DODGER_BLUE("33"),
	/**
	 * {@code Green3 - 	Xterm:34 - HEX:#00af00 - RGB:0,175,0}
	 */
	GREEN_3("34"),
	/**
	 * {@code SpringGreen3 - 	Xterm:35 - HEX:#00af5f - RGB:0,175,95}
	 */
	SPRING_GREEN_4("35"),
	/**
	 * {@code DarkCyan - 	Xterm:36 - HEX:#00af87 - RGB:0,175,135}
	 */
	DARK_CYAN("36"),
	/**
	 * {@code LightSeaGreen - 	Xterm:37 - HEX:#00afaf - RGB:0,175,175}
	 */
	LIGHT_SEA_GREEN("37"),
	/**
	 * {@code DeepSkyBlue1 - 	Xterm:38 - HEX:#00afd7 - RGB:0,175,215}
	 */
	DEEP_SKY_BLUE_1("38"),
	/**
	 * {@code DeepSkyBlue - 	Xterm:39 - HEX:#00afff - RGB:0,175,255}
	 */
	DEEP_SKY_BLUE("39"),
	/**
	 * {@code Green2 - 	Xterm:40 - HEX:#00d700 - RGB:0,215,0}
	 */
	GREEN_2("40"),
	/**
	 * {@code SpringGreen3 - 	Xterm:41 - HEX:#00d75f - RGB:0,215,95}
	 */
	SPRING_GREEN_3("41"),
	/**
	 * {@code SpringGreen2 - 	Xterm:42 - HEX:#00d787 - RGB:0,215,135}
	 */
	SPRING_GREEN_2("42"),
	/**
	 * {@code Cyan2 - 	Xterm:43 - HEX:#00d7af - RGB:0,215,175}
	 */
	CYAN_2("43"),
	/**
	 * {@code DarkTurquoise - 	Xterm:44 - HEX:#00d7d7 - RGB:0,215,215}
	 */
	DARK_TURQUOISE("44"),
	/**
	 * {@code Turquoise - 	Xterm:45 - HEX:#00d7ff - RGB:0,215,255}
	 */
	TURQUOISE("45"),
	/**
	 * {@code Green1 - 	Xterm:46 - HEX:#00ff00 - RGB:0,255,0}
	 */
	GREEN_1("46"),
	/**
	 * {@code SpringGreen1 - 	Xterm:47 - HEX:#00ff5f - RGB:0,255,95}
	 */
	SPRING_GREEN_1("47"),
	/**
	 * {@code SpringGreen - 	Xterm:48 - HEX:#00ff87 - RGB:0,255,135}
	 */
	SPRING_GREEN("48"),
	/**
	 * {@code MediumSpringGreen - 	Xterm:49 - HEX:#00ffaf - RGB:0,255,175}
	 */
	MEDIUM_SPRING_GREEN("49"),
	/**
	 * {@code Cyan1 - 	Xterm:50 - HEX:#00ffd7 - RGB:0,255,215}
	 */
	CYAN_1("50"),
	/**
	 * {@code Cyan - 	Xterm:51 - HEX:#00ffff - RGB:0,255,255}
	 */
	CYAN("51"),
	/**
	 * {@code DarkRed1 - 	Xterm:52 - HEX:#5f0000 - RGB:95,0,0}
	 */
	DARK_RED_1("52"),
	/**
	 * {@code DeepPink7 - 	Xterm:53 - HEX:#5f005f - RGB:95,0,95}
	 */
	DEEP_PINK_7("53"),
	/**
	 * {@code Purple5 - 	Xterm:54 - HEX:#5f0087 - RGB:95,0,135}
	 */
	PURPLE_5("54"),
	/**
	 * {@code Purple4 - 	Xterm:55 - HEX:#5f00af - RGB:95,0,175}
	 */
	PURPLE_4("55"),
	/**
	 * {@code Purple3 - 	Xterm:56 - HEX:#5f00d7 - RGB:95,0,215}
	 */
	PURPLE_3("56"),
	/**
	 * {@code BlueViolet - 	Xterm:57 - HEX:#5f00ff - RGB:95,0,255}
	 */
	BLUE_VIOLET("57"),
	/**
	 * {@code Orange3 - 	Xterm:58 - HEX:#5f5f00 - RGB:95,95,0}
	 */
	ORANGE_3("58"),
	/**
	 * {@code Grey37 - 	Xterm:59 - HEX:#5f5f5f - RGB:95,95,95}
	 */
	GREY_37("59"),
	/**
	 * {@code MediumPurple6 - 	Xterm:60 - HEX:#5f5f87 - RGB:95,95,135}
	 */
	MEDIUM_PURPLE_6("60"),
	/**
	 * {@code SlateBlue2 - 	Xterm:61 - HEX:#5f5faf - RGB:95,95,175}
	 */
	SLATE_BLUE_2("61"),
	/**
	 * {@code SlateBlue1 - 	Xterm:62 - HEX:#5f5fd7 - RGB:95,95,215}
	 */
	SLATE_BLUE_1("62"),
	/**
	 * {@code RoyalBlue - 	Xterm:63 - HEX:#5f5fff - RGB:95,95,255}
	 */
	ROYAL_BLUE("63"),
	/**
	 * {@code Chartreuse4 - 	Xterm:64 - HEX:#5f8700 - RGB:95,135,0}
	 */
	CHARTREUSE_4("64"),
	/**
	 * {@code DarkSeaGreen8 - 	Xterm:45 - HEX:#5f875f - RGB:95,135,95}
	 */
	DARK_SEA_GREEN_8("65"),
	/**
	 * {@code PaleTurquoise1 - 	Xterm:66 - HEX:#5f8787 - RGB:95,135,135}
	 */
	PALE_TURQUOISE_1("66"),
	/**
	 * {@code SteelBlue2 - 	Xterm:67 - HEX:#5f87af - RGB:95,135,175}
	 */
	STEELBLUE_2("67"),
	/**
	 * {@code SteelBlue1 - 	Xterm:68 - HEX:#5f87d7 - RGB:95,135,215}
	 */
	STEEL_BLUE_2("68"),
	/**
	 * {@code CornflowerBlue - 	Xterm:69 - HEX:#5f87ff - RGB:95,135,255}
	 */
	CORNFLOWER_BLUE("69"),
	/**
	 * {@code Chartreuse3 - 	Xterm:70 - HEX:#5faf00 - RGB:95,175,0}
	 */
	CHARTREUSE_3("70"),
	/**
	 * {@code DarkSeaGreen7 - 	Xterm:71 - HEX:#5faf5f - RGB:95,175,95}
	 */
	DARK_SEA_GREEN_7("71"),
	/**
	 * {@code CadetBlue1 - 	Xterm:72 - HEX:#5faf87 - RGB:95,175,135}
	 */
	CADET_BLUE_1("72"),
	/**
	 * {@code CadetBlue - 	Xterm:73 - HEX:#5fafaf - RGB:95,175,175}
	 */
	CADET_BLUE("73"),
	/**
	 * {@code SkyBlue2 - 	Xterm:74 - HEX:#5fafd7 - RGB:95,175,215}
	 */
	SKY_BLUE_2("74"),
	/**
	 * {@code SteelBlue - 	Xterm:75 - HEX:#5fafff - RGB:95,175,255}
	 */
	STEEL_BLUE_1("75"),
	/**
	 * {@code Chartreuse2 - 	Xterm:76 - HEX:#5fd700 - RGB:95,215,0}
	 */
	CHARTREUSE_2("76"),
	/**
	 * {@code PaleGreen3 - 	Xterm:77 - HEX:#5fd75f - RGB:95,215,95}
	 */
	PALE_GREEN_3("77"),
	/**
	 * {@code SeaGreen3 - 	Xterm:78 - HEX:#5fd787 - RGB:95,215,135}
	 */
	SEA_GREEN_3("78"),
	/**
	 * {@code SeaGreen - 	Xterm:79 - HEX:#5fd7af - RGB:95,215,175}
	 */
	AQUAMARINE_2("79"),
	/**
	 * {@code SeaGreen - 	Xterm:80 - HEX:#5fd7d7 - RGB:95,215,215}
	 */
	MEDIUM_TORQUOISE("80"),
	/**
	 * {@code SteelBlue1 - 	Xterm:81 - HEX:#5fd7ff - RGB:95,215,255}
	 */
	STEEL_BLUE("81"),
	/**
	 * {@code Chartreuse5 - 	Xterm:82 - HEX:#5fff00 - RGB:95,255,0}
	 */
	CHARTREUSE_5("82"),
	/**
	 * {@code SeaGreen2 - 	Xterm:83 - HEX:#5fff5f - RGB:95,255,95}
	 */
	SEA_GREEN_2("83"),
	/**
	 * {@code SeaGreen1 - 	Xterm:84 - HEX:#5fff87 - RGB:95,255,135}
	 */
	SEA_GREEN_1("84"),
	/**
	 * {@code SeaGreen - 	Xterm:85 - HEX:#5fffaf - RGB:95,255,175}
	 */
	SEA_GREEN("85"),
	/**
	 * {@code Aquamarine1 - 	Xterm:86 - HEX:#5fffd7 - RGB:95,255,215}
	 */
	AQUAMARINE_1("86"),
	/**
	 * {@code DarkSlateGray2 - 	Xterm:87 - HEX:#5fffff - RGB:95,255,255}
	 */
	DARK_SLATE_GRAY_2("87"),
	/**
	 * {@code DarkRed - 	Xterm:88 - HEX:#870000 - RGB:135,0,0}
	 */
	DARK_RED("88"),
	/**
	 * {@code DeepPink6 - 	Xterm:89 - HEX:#87005f - RGB:135,0,95}
	 */
	DEEP_PINK_6("89"),
	/**
	 * {@code DarkMagenta1 - 	Xterm:90 - HEX:#870087 - RGB:135,0,135}
	 */
	DARK_MAGNETA_1("90"),
	/**
	 * {@code DarkMagenta - 	Xterm:91 - HEX:#8700af - RGB:135,0,175}
	 */
	DARK_MAGNETA("91"),
	/**
	 * {@code DarkViolet1 - 	Xterm:92 - HEX:#8700d7 - RGB:135,0,215}
	 */
	DARK_VIOLET_1("92"),
	/**
	 * {@code Purple2 - 	Xterm:93 - HEX:#8700ff - RGB:135,0,255}
	 */
	PURPLE_2("93"),
	/**
	 * {@code Orange2 - 	Xterm:94 - HEX:#875f00 - RGB:135,95,0}
	 */
	ORANGE_2("94"),
	/**
	 * {@code LightPink2 - 	Xterm:95 - HEX:#875f5f - RGB:135,95,95}
	 */
	LIGHT_PINK_2("95"),
	/**
	 * {@code Plum3 - 	Xterm:96 - HEX:#875f87 - RGB:135,95,135}
	 */
	PLUM_3("96"),
	/**
	 * {@code MediumPurple5 - 	Xterm:97 - HEX:#875faf - RGB:135,95,175}
	 */
	MEDIUM_PURPLE_5("97"),
	/**
	 * {@code MediumPurple4 - 	Xterm:98 - HEX:#875fd7 - RGB:135,95,215}
	 */
	MEDIUM_PURPLE_4("98"),
	/**
	 * {@code SlateBlue - 	Xterm:99 - HEX:#875fff - RGB:135,95,255}
	 */
	SLATE_BLUE("99"),
	/**
	 * {@code Yellow6 - 	Xterm:100 - HEX:#878700 - RGB:135,135,0}
	 */
	YELLOW_6("100"),
	/**
	 * {@code Wheat1 - 	Xterm:101 - HEX:#87875f - RGB:135,135,95}
	 */
	WHEAT_1("101"),
	/**
	 * {@code Grey53 - 	Xterm:102 - HEX:#878787 - RGB:135,135,135}
	 */
	GREY_53("102"),
	/**
	 * {@code LightSlateGrey - 	Xterm:103 - HEX:#8787af - RGB:135,135,175}
	 */
	LIGHT_SLATE_GREY("103"),
	/**
	 * {@code MediumPurple3 - 	Xterm:104 - HEX:#8787d7 - RGB:135,135,215}
	 */
	MEDIUM_PURPLE_3("104"),
	/**
	 * {@code LightSlateBlue - 	Xterm:105 - HEX:#8787ff - RGB:135,135,255}
	 */
	LIGHT_SLATE_BLUE("105"),
	/**
	 * {@code Yellow5 - 	Xterm:106 - HEX:#87af00 - RGB:135,175,0}
	 */
	YELLOW_5("106"),
	/**
	 * {@code DarkOliveGreen5 - 	Xterm:107 - HEX:#87af5f - RGB:135,175,95}
	 */
	DARK_OLIVE_GREEN_5("107"),
	/**
	 * {@code DarkSeaGreen6 - 	Xterm:108 - HEX:#87af87 - RGB:135,175,135}
	 */
	DARK_SEA_GREEN_6("108"),
	/**
	 * {@code LightSkyBlue2 - 	Xterm:109 - HEX:#87afaf - RGB:135,175,175}
	 */
	LIGHT_SKY_BLUE_2("109"),
	/**
	 * {@code LightSkyBlue1 - 	Xterm:110 - HEX:#87afd7 - RGB:135,175,215}
	 */
	LIGHT_SKY_BLUE_1("110"),
	/**
	 * {@code SkyBlue1 - 	Xterm:111 - HEX:#87afff - RGB:135,175,255}
	 */
	SKY_BLUE_1("111"),
	/**
	 * {@code Chartreuse1 - 	Xterm:112 - HEX:#87d700 - RGB:135,215,0}
	 */
	CHARTREUSE_1("112"),
	/**
	 * {@code DarkOliveGreen4 - 	Xterm:113 - HEX:#87d75f - RGB:135,215,95}
	 */
	DARK_OLIVE_GREEN_4("113"),
	/**
	 * {@code PaleGreen2 - 	Xterm:114 - HEX:#87d787 - RGB:135,215,135}
	 */
	PALE_GREEN_2("114"),
	/**
	 * {@code DarkSeaGreen5 - 	Xterm:115 - HEX:#87d7af - RGB:135,215,175}
	 */
	DARK_SEA_GREEN_5("115"),
	/**
	 * {@code DarkSlateGray3 - 	Xterm:116 - HEX:#87d7d7 - RGB:135,215,215}
	 */
	DARK_SLATE_GRAY_1("116"),
	/**
	 * {@code SkyBlue - 	Xterm:117 - HEX:#87d7ff - RGB:135,215,255}
	 */
	SKY_BLUE("117"),
	/**
	 * {@code Chartreuse - 	Xterm:118 - HEX:#87ff00 - RGB:135,255,0}
	 */
	CHARTREUSE("118"),
	/**
	 * {@code LightGreen1 - 	Xterm:119 - HEX:#87ff5f - RGB:135,255,95}
	 */
	LIGHT_GREEN_1("119"),
	/**
	 * {@code LightGreen - 	Xterm:120 - HEX:#87ff87 - RGB:135,255,135}
	 */
	LIGHT_GREEN("120"),
	/**
	 * {@code PaleGreen1 - 	Xterm:121 - HEX:#87ffaf - RGB:135,255,175}
	 */
	PALE_GREEN_1("121"),
	/**
	 * {@code Aquamarine - 	Xterm:122 - HEX:#87ffd7 - RGB:135,255,215}
	 */
	AQUAMARINE("122"),
	/**
	 * {@code DarkSlateGray - 	Xterm:123 - HEX:#87ffff - RGB:135,255,255}
	 */
	DARK_SLATE_GRAY("123"),
	/**
	 * {@code Red3 - 	Xterm:124 - HEX:#af0000 - RGB:175,0,0}
	 */
	RED_3("124"),
	/**
	 * {@code DeepPink4 - 	Xterm:125 - HEX:#af005f - RGB:175,0,95}
	 */
	DEEP_PINK_5("125"),
	/**
	 * {MediumVioletRed Black - Xterm:126 - HEX:#af0087 - RGB:175,0,135}
	 */
	MEDIUM_VIOLET_RED("126"),
	/**
	 * {@code Magenta5 - 	Xterm:127 - HEX:#af00af - RGB:175,0,175}
	 */
	MAGNETA_5("127"),
	/**
	 * {@code DarkViolet - 	Xterm:128 - HEX:#af00d7 - RGB:175,0,215}
	 */
	DARK_VIOLET("128"),
	/**
	 * {@code Purple1 - 	Xterm:129 - HEX:#af00ff - RGB:175,0,255}
	 */
	PURPLE_1("129"),
	/**
	 * {@code DarkOrange2 - 	Xterm:130 - HEX:#af5f00 - RGB:175,95,0}
	 */
	DARK_ORANGE_2("130"),
	/**
	 * {@code IndianRed3 - 	Xterm:131 - HEX:#af5f5f - RGB:175,95,95}
	 */
	INDIAN_RED_3("131"),
	/**
	 * {@code HotPink4 - 	Xterm:132 - HEX:#af5f87 - RGB:175,95,135}
	 */
	HOT_PINK_4("132"),
	/**
	 * {@code MediumOrchid3 - 	Xterm:133 - HEX:#af5faf - RGB:175,95,175}
	 */
	MEDIUM_ORCHID_3("133"),
	/**
	 * {@code MediumOrchid2 - 	Xterm:134 - HEX:#af5fd7 - RGB:175,95,215}
	 */
	MEDIUM_ORCHID_2("134"),
	/**
	 * {@code MediumPurple2 - 	Xterm:135 - HEX:#af5fff - RGB:175,95,255}
	 */
	MEDIUM_PURPLE_2("135"),
	/**
	 * {@code DarkGoldenrod - 	Xterm:136 - HEX:#af8700 - RGB:175,135,0}
	 */
	DARK_GOLDENROD("136"),
	/**
	 * {@code LightSalmon2 - 	Xterm:137 - HEX:#af875f - RGB:175,135,95}
	 */
	LIGHT_SALMON_2("137"),
	/**
	 * {@code RosyBrown - 	Xterm:138 - HEX:#af8787 - RGB:175,135,135}
	 */
	ROSY_BROWN("138"),
	/**
	 * {@code Grey63 - 	Xterm:139 - HEX:#af87af - RGB:175,135,175}
	 */
	GREY_63("139"),
	/**
	 * {@code MediumPurple1 - 	Xterm:140 - HEX:#af87d7 - RGB:175,135,215}
	 */
	MEDIUM_PURPLE_1("140"),
	/**
	 * {@code MediumPurple - 	Xterm:141 - HEX:#af87ff - RGB:175,135,255}
	 */
	MEDIUM_PURPLE("141"),
	/**
	 * {@code Gold2 - 	Xterm:142 - HEX:#afaf00 - RGB:175,175,0}
	 */
	GOLD_2("142"),
	/**
	 * {@code DarkKhaki - 	Xterm:143 - HEX:#afaf5f - RGB:175,175,95}
	 */
	DARK_KHAKI("143"),
	/**
	 * {@code NavajoWhite1 - 	Xterm:144 - HEX:#afaf87 - RGB:175,175,135}
	 */
	NAVAJO_WHITE_1("144"),
	/**
	 * {@code Grey69 - 	Xterm:145 - HEX:#afafaf - RGB:175,175,175}
	 */
	GREY_69("145"),
	/**
	 * {@code LightSteelBlue2 - 	Xterm:146 - HEX:#afafd7 - RGB:175,175,215}
	 */
	LIGHT_STEEL_BLUE_2("146"),
	/**
	 * {@code LightSteelBlue1 - 	Xterm:147 - HEX:#afafff - RGB:175,175,255}
	 */
	LIGHT_STEEL_BLUE_1("147"),
	/**
	 * {@code Yellow4 - 	Xterm:148 - HEX:#afd700 - RGB:175,215,0}
	 */
	YELLOW_4("148"),
	/**
	 * {@code DarkOliveGreen3 - 	Xterm:149 - HEX:#afd75f - RGB:175,215,95}
	 */
	DARK_OLIVE_GREEN_3("149"),
	/**
	 * {@code DarkSeaGreen4 - 	Xterm:150 - HEX:#afd787 - RGB:175,215,135}
	 */
	DARK_SEA_GREEN_4("150"),
	/**
	 * {@code DarkSeaGreen3 - 	Xterm:151 - HEX:#afd7af - RGB:175,215,175}
	 */
	DARK_SEA_GREEN_3("151"),
	/**
	 * {@code LightCyan1 - 	Xterm:152 - HEX:#afd7d7 - RGB:175,215,215}
	 */
	LIGHT_CYAN_1("152"),
	/**
	 * {@code LightSkyBlue - 	Xterm:153 - HEX:#afd7ff - RGB:175,215,255}
	 */
	LIGHT_SKY_BLUE("153"),
	/**
	 * {@code GreenYellow - 	Xterm:154 - HEX:#afff00 - RGB:175,255,0}
	 */
	GREEN_YELLOW("154"),
	/**
	 * {@code DarkOliveGreen2 - 	Xterm:155 - HEX:#afff5f - RGB:175,255,95}
	 */
	DARK_OLIVE_GREEN_2("155"),
	/**
	 * {@code PaleGreen - 	Xterm:156 - HEX:#afff87 - RGB:175,255,135}
	 */
	PALE_GREEN("156"),
	/**
	 * {@code DarkSeaGreen2 - 	Xterm:157 - HEX:#afffaf - RGB:175,255,175}
	 */
	DARK_SEA_GREEN_2("157"),
	/**
	 * {@code DarkSeaGreen1 - 	Xterm:158 - HEX:#afffd7 - RGB:175,255,215}
	 */
	DARK_SEA_GREEN_1("158"),
	/**
	 * {@code PaleTurquoise - 	Xterm:159 - HEX:#afffff - RGB:175,255,255}
	 */
	PALE_TURQUOISE("159"),
	/**
	 * {@code Red2 - 	Xterm:160 - HEX:#d70000 - RGB:215,0,0}
	 */
	RED_2("160"),
	/**
	 * {@code DeepPink4 - 	Xterm:161 - HEX:#d7005f - RGB:215,0,95}
	 */
	DEEP_PINK_4("161"),
	/**
	 * {@code DeepPink3 - 	Xterm:162 - HEX:#d70087 - RGB:215,0,135}
	 */
	DEEP_PINK_3("162"),
	/**
	 * {@code Magenta4 - 	Xterm:163 - HEX:#d700af - RGB:215,0,175}
	 */
	MAGNETA_4("163"),
	/**
	 * {@code Magenta3 - 	Xterm:164 - HEX:#d700d7 - RGB:215,0,215}
	 */
	MAGNETA_3("164"),
	/**
	 * {@code Magenta2 - 	Xterm:165 - HEX:#d700ff - RGB:215,0,255}
	 */
	MAGNETA_2("165"),
	/**
	 * {@code DarkOrange1 - 	Xterm:166 - HEX:#d75f00 - RGB:215,95,0}
	 */
	DARK_ORANGE_1("166"),
	/**
	 * {@code IndianRed - 	Xterm:167 - HEX:#d75f5f - RGB:215,95,95}
	 */
	INDIAN_RED("167"),
	/**
	 * {@code HotPink3 - 	Xterm:168 - HEX:#d75f87 - RGB:215,95,135}
	 */
	HOT_PINK_3("168"),
	/**
	 * {@code HotPink2 - 	Xterm:169 - HEX:#d75faf - RGB:215,95,175}
	 */
	HOT_PINK_2("169"),
	/**
	 * {@code Orchid - 	Xterm:170 - HEX:#d75fd7 - RGB:215,95,215}
	 */
	ORCHID("170"),
	/**
	 * {@code MediumOrchid1 - 	Xterm:171 - HEX:#d75fff - RGB:215,95,255}
	 */
	MEDIUM_ORCHID_1("171"),
	/**
	 * {@code Orange1 - 	Xterm:172 - HEX:#d78700 - RGB:215,135,0}
	 */
	ORANGE_1("172"),
	/**
	 * {@code LightSalmon1 - 	Xterm:173 - HEX:#d7875f - RGB:215,135,95}
	 */
	LIGHT_SALMON_1("173"),
	/**
	 * {@code LightPink3 - 	Xterm:174 - HEX:#d78787 - RGB:215,135,135}
	 */
	LIGHT_PINK_1("174"),
	/**
	 * {@code Pink1 - 	Xterm:175 - HEX:#d787af - RGB:215,135,175}
	 */
	PINK_1("175"),
	/**
	 * {@code Plum2 - 	Xterm:176 - HEX:#d787d7 - RGB:215,135,215}
	 */
	PLUM_2("176"),
	/**
	 * {@code Violet - 	Xterm:177 - HEX:#d787ff - RGB:215,135,255}
	 */
	VIOLET("177"),
	/**
	 * {@code Gold1 - 	Xterm:178 - HEX:#d7af00 - RGB:215,175,0}
	 */
	GOLD_1("178"),
	/**
	 * {@code LightGoldenrod4 - 	Xterm:179 - HEX:#d7af5f - RGB:215,175,95}
	 */
	LIGHT_GOLDENROD_4("179"),
	/**
	 * {@code Tan - 	Xterm:180 - HEX:#d7af87 - RGB:215,175,135}
	 */
	TAN("180"),
	/**
	 * {@code MistyRose1 - 	Xterm:181 - HEX:#d7afaf - RGB:215,175,175}
	 */
	MISTY_ROSE_1("181"),
	/**
	 * {@code Thistle3 - 	Xterm:182 - HEX:#d7afd7 - RGB:215,175,215}
	 */
	THISTLE_1("182"),
	/**
	 * {@code Plum1 - 	Xterm:183 - HEX:#d7afff - RGB:215,175,255}
	 */
	PLUM_1("183"),
	/**
	 * {@code Yellow3 - 	Xterm:184 - HEX:#d7d700 - RGB:215,215,0}
	 */
	YELLOW_3("184"),
	/**
	 * {@code Khaki1 - 	Xterm:185 - HEX:#d7d75f - RGB:215,215,95}
	 */
	KHAKI_1("185"),
	/**
	 * {@code LightGoldenrod3 - 	Xterm:186 - HEX:#d7d787 - RGB:215,215,135}
	 */
	LIGHT_GOLDENROD_3("186"),
	/**
	 * {@code LightYellow - 	Xterm:187 - HEX:#d7d7af - RGB:215,215,175}
	 */
	LIGHT_YELLOW("187"),
	/**
	 * {@code Grey84 - 	Xterm:188 - HEX:#d7d7d7 - RGB:215,215,215}
	 */
	GREY_84("188"),
	/**
	 * {@code LightSteelBlue - 	Xterm:189 - HEX:#d7d7ff - RGB:215,215,255}
	 */
	LIGHT_STEEL_BLUE("189"),
	/**
	 * {@code Yellow2 - 	Xterm:190 - HEX:#d7ff00 - RGB:215,255,0}
	 */
	YELLOW_2("190"),
	/**
	 * {@code DarkOliveGreen1 - 	Xterm:191 - HEX:#d7ff5f - RGB:215,255,95}
	 */
	DARK_OLIVE_GREEN_1("191"),
	/**
	 * {@code DarkOliveGreen - 	Xterm:192 - HEX:#d7ff87 - RGB:215,255,135}
	 */
	DARK_OLIVE_GREEN("192"),
	/**
	 * {@code DarkSeaGreen - 	Xterm:193 - HEX:#d7ffaf - RGB:215,255,175}
	 */
	DARK_SEA_GREEN("193"),
	/**
	 * {@code Honeydew2 - 	Xterm:194 - HEX:#d7ffd7 - RGB:215,255,215}
	 */
	HONEYDEW("194"),
	/**
	 * {@code LightCyan - 	Xterm:195 - HEX:#d7ffff - RGB:215,255,255}
	 */
	LIGHT_CYAN("195"),
	/**
	 * {@code Red1 - 	Xterm:196 - HEX:#ff0000 - RGB:255,0,0}
	 */
	RED_1("196"),
	/**
	 * {@code DeepPink2 - 	Xterm:197 - HEX:#ff005f - RGB:255,0,95}
	 */
	DEEP_PINK_2("197"),
	/**
	 * {@code DeepPink1 - 	Xterm:198 - HEX:#ff0087 - RGB:255,0,135}
	 */
	DEEP_PINK_1("198"),
	/**
	 * {@code DeepPink - 	Xterm:199 - HEX:#ff00af - RGB:255,0,175}
	 */
	DEEP_PINK("199"),
	/**
	 * {@code Magenta1 - 	Xterm:200 - HEX:#ff00d7 - RGB:255,0,215}
	 */
	MAGNETA_1("200"),
	/**
	 * {@code Magenta - 	Xterm:201 - HEX:#ff00ff - RGB:255,0,255}
	 */
	MAGNETA("201"),
	/**
	 * {@code OrangeRed - 	Xterm:202 - HEX:#ff5f00 - RGB:255,95,0}
	 */
	ORANGE_RED("202"),
	/**
	 * {@code IndianRed2 - 	Xterm:203 - HEX:#ff5f5f - RGB:255,95,95}
	 */
	INDIAN_RED_2("203"),
	/**
	 * {@code IndianRed1 - 	Xterm:204 - HEX:#ff5f87 - RGB:255,95,135}
	 */
	INDIAN_RED_1("204"),
	/**
	 * {@code HotPink1 - 	Xterm:205 - HEX:#ff5faf - RGB:255,95,175}
	 */
	HOT_PINK_1("205"),
	/**
	 * {@code HotPink - 	Xterm:206 - HEX:#ff5fd7 - RGB:255,95,215}
	 */
	HOT_PINK("206"),
	/**
	 * {@code MediumOrchid - 	Xterm:207 - HEX:#ff5fff - RGB:255,95,255}
	 */
	MEDIUM_ORCHID("207"),
	/**
	 * {@code DarkOrange - 	Xterm:208 - HEX:#ff8700 - RGB:255,135,0}
	 */
	DARK_ORANGE("208"),
	/**
	 * {@code Salmon - 	Xterm:209 - HEX:#ff875f - RGB:255,135,95}
	 */
	SALMON("209"),
	/**
	 * {@code LightCoral - 	Xterm:210 - HEX:#ff8787 - RGB:255,135,135}
	 */
	LIGHT_CORAL("210"),
	/**
	 * {@code PaleVioletRed - 	Xterm:211 - HEX:#ff87af - RGB:255,135,175}
	 */
	PALE_VIOLET_RED("211"),
	/**
	 * {@code Orchid2 - 	Xterm:212 - HEX:#ff87d7 - RGB:255,135,215}
	 */
	ORCHID_2("212"),
	/**
	 * {@code Orchid1 - 	Xterm:213 - HEX:#ff87ff - RGB:255,135,255}
	 */
	ORCHID_1("213"),
	/**
	 * {@code Orange - 	Xterm:214 - HEX:#ffaf00 - RGB:255,175,0}
	 */
	ORANGE("214"),
	/**
	 * {@code SandyBrown - 	Xterm:215 - HEX:#ffaf5f - RGB:255,175,95}
	 */
	SANDY_BROWN("215"),
	/**
	 * {@code LightSalmon - 	Xterm:216 - HEX:#ffaf87 - RGB:255,175,135}
	 */
	LIGHT_SALMON("216"),
	/**
	 * {@code LightPink1 - 	Xterm:217 - HEX:#ffafaf - RGB:255,175,175}
	 */
	LIGHT_PINK("217"),
	/**
	 * {@code Pink - 	Xterm:218 - HEX:#ffafd7 - RGB:255,175,215}
	 */
	PINK("218"),
	/**
	 * {@code Plum - 	Xterm:219 - HEX:#ffafff - RGB:255,175,255}
	 */
	PLUM("219"),
	/**
	 * {@code Gold - 	Xterm:220 - HEX:#ffd700 - RGB:255,215,0}
	 */
	GOLD("220"),
	/**
	 * {@code LightGoldenrod2 - 	Xterm:221 - HEX:#ffd75f - RGB:255,215,95}
	 */
	LIGHT_GOLDENROD_2("221"),
	/**
	 * {@code LightGoldenrod1 - 	Xterm:222 - HEX:#ffd787 - RGB:255,215,135}
	 */
	LIGHT_GOLDENROD_1("222"),
	/**
	 * {@code NavajoWhite - 	Xterm:223 - HEX:#ffd7af - RGB:255,215,175}
	 */
	NAVAJO_WHITE("223"),
	/**
	 * {@code MistyRose - 	Xterm:224 - HEX:#ffd7d7 - RGB:255,215,215}
	 */
	MISTY_ROSE("224"),
	/**
	 * {@code Thistle - 	Xterm:225 - HEX:#ffd7ff - RGB:255,215,255}
	 */
	THISTLE("225"),
	/**
	 * {@code Yellow1 - 	Xterm:226 - HEX:#ffff00 - RGB:255,255,0}
	 */
	YELLOW_1("226"),
	/**
	 * {@code LightGoldenrod - 	Xterm:227 - HEX:#ffff5f - RGB:255,255,95}
	 */
	LIGHT_GOLDENROD("227"),
	/**
	 * {@code Khaki - 	Xterm:228 - HEX:#ffff87 - RGB:255,255,135}
	 */
	KHAKI("228"),
	/**
	 * {@code Wheat - 	Xterm:229 - HEX:#ffffaf - RGB:255,255,175}
	 */
	WHEAT("229"),
	/**
	 * {@code Cornsilk - 	Xterm:230 - HEX:#ffffd7 - RGB:255,255,215}
	 */
	CORNSILK("230"),
	/**
	 * {@code Grey100 - 	Xterm:231 - HEX:#ffffff - RGB:255,255,255}
	 */
	GREY_100("231"),
	/**
	 * {@code Grey24 - 	Xterm:232 - HEX:#080808 - RGB:8,8,8}
	 */
	GREY_24("232"),
	/**
	 * {@code Grey23 - 	Xterm:233 - HEX:#121212 - RGB:18,18,18}
	 */
	GREY_23("233"),
	/**
	 * {@code Grey22 - 	Xterm:234 - HEX:#1c1c1c - RGB:28,28,28}
	 */
	GREY_22("234"),
	/**
	 * {@code Grey21 - 	Xterm:235 - HEX:#262626 - RGB:38,38,38}
	 */
	GREY_21("235"),
	/**
	 * {@code Grey20 - 	Xterm:236 - HEX:#303030 - RGB:48,48,48}
	 */
	GREY_20("236"),
	/**
	 * {@code Grey19 - 	Xterm:237 - HEX:#3a3a3a - RGB:58,58,58}
	 */
	GREY_19("237"),
	/**
	 * {@code Grey18 - 	Xterm:238 - HEX:#444444 - RGB:68,68,68}
	 */
	GREY_18("238"),
	/**
	 * {@code Grey17 - 	Xterm:239 - HEX:#4e4e4e - RGB:78,78,78}
	 */
	GREY_17("239"),
	/**
	 * {@code Grey16 - 	Xterm:240 - HEX:#585858 - RGB:88,88,88}
	 */
	GREY_16("240"),
	/**
	 * {@code Grey15 - 	Xterm:241 - HEX:#626262 - RGB:98,98,98}
	 */
	GREY_15("241"),
	/**
	 * {@code Grey14 - 	Xterm:242 - HEX:#6c6c6c - RGB:108,108,108}
	 */
	GREY_14("242"),
	/**
	 * {@code Grey13 - 	Xterm:243 - HEX:#767676 - RGB:118,118,118}
	 */
	GREY_13("243"),
	/**
	 * {@code Grey12 - 	Xterm:244 - HEX:#808080 - RGB:128,128,128}
	 */
	GREY_12("244"),
	/**
	 * {@code Grey11 - 	Xterm:245 - HEX:#8a8a8a - RGB:138,138,138}
	 */
	GREY_11("245"),
	/**
	 * {@code Grey10 - 	Xterm:246 - HEX:#949494 - RGB:148,148,148}
	 */
	GREY_10("246"),
	/**
	 * {@code Grey9 - 	Xterm:247 - HEX:#9e9e9e - RGB:158,158,158}
	 */
	GREY_9("247"),
	/**
	 * {@code Grey8 - 	Xterm:248 - HEX:#a8a8a8 - RGB:168,168,168}
	 */
	GREY_8("248"),
	/**
	 * {@code Grey7 - 	Xterm:249 - HEX:#b2b2b2 - RGB:178,178,178}
	 */
	GREY_7("249"),
	/**
	 * {@code Grey6 - 	Xterm:250 - HEX:#bcbcbc - RGB:188,188,188}
	 */
	GREY_6("250"),
	/**
	 * {@code Grey5 - 	Xterm:251 - HEX:#c6c6c6 - RGB:198,198,198}
	 */
	GREY_5("251"),
	/**
	 * {@code Grey4 - 	Xterm:252 - HEX:#d0d0d0 - RGB:208,208,208}
	 */
	GREY_4("252"),
	/**
	 * {@code Grey3 - 	Xterm:253 - HEX:#dadada - RGB:218,218,218}
	 */
	GREY_3("253"),
	/**
	 * {@code Grey2 - 	Xterm:254 - HEX:#e4e4e4 - RGB:228,228,228}
	 */
	GREY_2("254"),
	/**
	 * {@code Grey1 - 	Xterm:255 - HEX:#eeeeee - RGB:238,238,238}
	 */
	GREY_1("255");

	private String code;

	Color(String code) {
		this.code = code;
	}

	/**
	 * Return a string representation of this Xterm code.
	 */
	@Override
	public String toString() {
		return code;
	}

}
