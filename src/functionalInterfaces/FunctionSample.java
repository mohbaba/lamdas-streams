package functionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String,Integer> function = (word)->word.length();
        System.out.println(function.apply("Mohbaba"));
    }
}
