package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Beautified text", (text) -> "***" + text + "***");
        poemBeautifier.beautify("Beautified text", String::toUpperCase);
        poemBeautifier.beautify("Beautified text", (text) -> "~~~~~~" + text + " *** " + text + "~~~~");
        poemBeautifier.beautify("Beautified text", (text) -> "///" + text + "///");
    }
}
