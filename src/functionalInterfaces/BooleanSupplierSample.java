package functionalInterfaces;

import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class BooleanSupplierSample {
    private static String password;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password");
        password = scanner.next();
        BooleanSupplier booleanSupplier = ()->{

            return "password".equals(password);
        };

        System.out.println(booleanSupplier.getAsBoolean());
    }
}
