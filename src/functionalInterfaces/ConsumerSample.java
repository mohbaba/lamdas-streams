package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample{

    public static void main(String[] args) {
        Consumer<String> consumer = (s) ->{
            System.out.println("You have entered "+s);
            System.out.println("Printing "+s);
        };
//        consumer.accept("Abike");

        List<String> names = List.of("Mohbaba","Dayo", "Jummy");
        names.forEach(consumer);
    }
}