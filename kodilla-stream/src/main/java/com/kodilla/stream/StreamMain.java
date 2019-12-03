package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "/")));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", (text -> "XYZ" + text + "XYZ"));
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Text to beautify", (text -> text.length() + " letters lenght ***" + text + "*** " + text.length() + " letters letters"));
        System.out.println(beautifulText4);
    }
}