package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.lang.reflect.Array;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

//        SaySomething saySomething = new SaySomething();
//        saySomething.say();

//        Processor processor = new Processor();                                // [6]
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
//        processor.execute(executeSaySomething);

//        Processor processor = new Processor();                                  // [6]
//        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
//        processor.execute(codeToExecute);

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Lorem Ipsum", String::toUpperCase);
        poemBeautifier.beautify("Lorem Ipsum", String::toLowerCase);
        poemBeautifier.beautify("Lorem Ipsum", (t) -> t+"ABC");
        poemBeautifier.beautify("Lorem Ipsum", (t) -> "ABC"+t);


        PoemDecorator decor1 = (t) -> {
            String result = "";
            for(char c:t.toCharArray()){
                result += c + "\n";
            }
            return result;
        };

        poemBeautifier.beautify("Lorem Ipsum", decor1);

        PoemDecorator decor2 = (t) -> {
            String result = "";
            for(char c:t.toCharArray()){
                result += c + " ";
            }
            return result;
        };
        poemBeautifier.beautify("Lorem Ipsum", decor2);
    }

}
