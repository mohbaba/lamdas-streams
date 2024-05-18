package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (a,b)->{
            return a.length() + b.length();
        };

        int result = biFunction.apply("Mohbaba","Stack");
        System.out.println(result);
    }
}
