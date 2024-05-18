package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (word1, word2)->{
            return word1.equals(word2);
        };
        System.out.println(biPredicate.test("Mohbaba","Mohbaba"));
    }
}
