package three_три;


import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Vadim", "ASd", "asd", "Abay18", 1892, "065234");
        customers[1] = new Customer("Alibi", "Test", "Momych", "Abay 23", 123, "065234");
        Printer printer = new Printer(customers);

        printer.printWithDiaposon(1000,5000);
        System.out.println("_________________");
        printer.printSorted();

    }
}
