package functionalInterfaces;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (word, number) ->
                printNameAndAge(word, number);
        ;

        Map<String, Integer> map = Map.of("Once",10,"Moh",7);
        map.forEach(biConsumer);
    }


    private static void printNameAndAge(String name, Integer age){
        System.out.println(name+":"+age);
    }
}
