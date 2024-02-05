package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printTheParts = (s -> {
            String[] parts = s.split(" ");
            for (String p : parts){
                System.out.println(p);
            }
        });
        printTheParts.accept("Lets split this up");

        Consumer<String> printWordsForEach = (sentance -> {
            String[] parts = sentance.split(" ");
            Arrays.asList(parts).forEach(s-> System.out.println(s));
        });
        printWordsForEach.accept("Lets split this up");

        Consumer<String> printWordsConcise= (sentance ->
          Arrays.asList(sentance.split(" ")).forEach(s-> System.out.println(s))
        );
        printWordsConcise.accept("Lets split this up");

        Function<String,String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++){
                if (i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondChar.apply("1234567890"));

       String result =  everySecondCharacter(everySecondChar,"1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love java";
        Supplier<String> iLoveJava2 = () -> {
            return "I love java";
        };

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
        System.out.println(iLoveJava2.get());

    }
    public static String everySecondCharacter(Function<String,String> p1, String source){

       return p1.apply(source);
    }

}
