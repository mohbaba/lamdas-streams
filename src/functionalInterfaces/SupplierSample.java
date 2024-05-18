package functionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {

    static Supplier<Integer> supplier = ()->new Random().nextInt() ;

    public static void main(String[] args) {
        System.out.println(supplier.get());

    }
}
