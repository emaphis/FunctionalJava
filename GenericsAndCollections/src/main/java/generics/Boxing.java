
package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *1.2  Boxing and Unboxing
 * @author emaph
 */
public class Boxing {

    // Automatic boxing
    static void automatic() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        int n = ints.get(0);
    }

    // Unnecesary boxing and unboxing
    static void manual() {
        List<Integer> ints = new ArrayList<>();
        ints.add(Integer.valueOf(1));
        int n = ints.get(0).intValue();
    }

    static int sumInt(List<Integer> ints) {
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }

    static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n;
        }
        return s;
    }

    static void testSum() {
        List<Integer> ints = Arrays.asList(1, 2, 3 );
        int sum = sumInt(ints);
        assert 5 == sum : "sould be 6";
    }

    static void testSumInteger() {
        List<Integer> ints = Arrays.asList(1, 2, 3 );
        int sum = sumInteger(ints);
        assert 6 == sum;
    }

    public static void main(String[] args) {
        automatic();
        manual();
        testSum();
        testSumInteger();
    }
}
