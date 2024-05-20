package functionalInterfaces;

import java.util.List;
import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {


    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (doubleNumber) ->{
            return (int)doubleNumber;
        };
        List<Double> numbers = List.of(2.0,0.5,7.00000);
        for (Double num: numbers) {
            System.out.println(doubleToIntFunction.applyAsInt(num));
        }
//        doubleToIntFunction.applyAsInt()

    }
}
