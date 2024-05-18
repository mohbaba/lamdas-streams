package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (a)-> a;
        System.out.println(unaryOperator.apply(2));

    }
}
