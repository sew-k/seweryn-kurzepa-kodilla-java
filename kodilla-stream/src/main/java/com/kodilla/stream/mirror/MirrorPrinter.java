package com.kodilla.stream.mirror;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MirrorPrinter {

    static String mirror(String text) {
        List<Character> textQ = new ArrayList<>();
        for (int i = (text.length() -1); i >= 0; i--) {
            textQ.add(text.charAt(i));
        }

        String result = textQ.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining(""));

        return result;
    }
}
