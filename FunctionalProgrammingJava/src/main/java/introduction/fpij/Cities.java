package introduction.fpij;

import java.util.Arrays;
import java.util.List;

public class Cities {

    public static void findChicagoImperative(final List<String> cities) {
        boolean found = false;
        for (String city : cities) {
            if (city.equals("Chicago")) {
                found = true;
                break;
            }
        }

        System.out.println("Found chicago?:" + found);
    }

    public static void findChicagoDeclarative(final List<String> cities) {
        System.out.println("Found chicago?:" + cities.contains("Chicago"));
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");

        findChicagoImperative(cities);
        findChicagoDeclarative(cities);
    }

}
