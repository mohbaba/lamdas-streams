package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (word)->{
            return word==5;
        };
        System.out.println(predicate.test(10));
    }

}
