package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println();

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10,5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10,5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10,5, ((a, b) -> a / b));

        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println();

        System.out.println("Text beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Example text", text -> "ABC Example text ABC");
        poemBeautifier.beautify("Example text", text -> text.toUpperCase());
        poemBeautifier.beautify("Example text", text -> "ExAmPlE TeXt");
        poemBeautifier.beautify("EXAMPLE TEXT", text -> text.toLowerCase());








    }
}
