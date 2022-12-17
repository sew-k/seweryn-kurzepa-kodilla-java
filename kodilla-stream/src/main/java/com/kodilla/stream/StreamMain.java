package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import java.util.*;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expression with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expression with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("An example of text", text -> "-|- " + text + " -|-");
        poemBeautifier.beautify("An example of text", text -> {
            String str = new String(text);
            text = str.toUpperCase();
            return text;
        });
        poemBeautifier.beautify("An example of text", text ->  {
            String str = new String(text);
            text = str.toLowerCase();
            return text;
        });
        poemBeautifier.beautify("An example of text", text ->  {
            String str = new String(text);
            char[] textArray = str.toCharArray();
            String spaces = "";
            for (int i=0; i<textArray.length; i++) {
                System.out.println(spaces + textArray[i]);
                spaces += "   ";
            };
            return "voila!";
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
