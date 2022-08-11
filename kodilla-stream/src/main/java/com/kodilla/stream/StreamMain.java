package com.kodilla.stream;

import com.kodilla.stream.iterable.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        //PoemBeautifier poemBeautifier = new PoemBeautifier();
        //poemBeautifier.beautify("Beautified text", (text) -> "***" + text + "***");
        //poemBeautifier.beautify("Beautified text", String::toUpperCase);
        //poemBeautifier.beautify("Beautified text", (text) -> "~~~~~~" + text + " *** " + text + "~~~~");
        //poemBeautifier.beautify("Beautified text", (text) -> "///" + text + "///");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
