package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {

    public static void main(String[] args) {


        List<Double> doubleList = List.of(2.3333,3.993939,5.900000);
        doubleList.forEach(System.out::println);
    }


}
