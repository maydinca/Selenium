package C009;

import java.util.Arrays;
import java.util.Iterator;

public class _004_CarsTest {
    public static void main(String[] args) {
        // Regular way of storing objects in an array
        Cars[] carsArray = {
                new Toyota("Gasoline"),
                new Honda("Gasoline"),
                new Tesla("Electric"),
                new Opel("Gasoline")
        };

        System.out.println("\n--- Enhanced Loop ---");
        for (Cars car : carsArray) {
            car.fuelType();
        }

        System.out.println("\n--- For Loop ---");
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i].fuelType();
        }

        System.out.println("\n--- Iterator ---");
        Iterator<Cars> iterator = Arrays.stream(carsArray).iterator();
        while (iterator.hasNext()) {
            iterator.next().fuelType();
        }
    }
}
