
package generics;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/**
 * 1.3  Foreach
 * @author emaph
 */
public class Foreach {

    static void sumForeach() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (Integer n : ints) {
            s += n;
        }
        assert s == 6 : "should be 6";
    }

    /// Old way with an iterator
    static void sumIterator() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (Iterator<Integer> it = ints.iterator(); it.hasNext();) {
            int n = it.next();
            s += n;
        }
        assert s == 6 : "should be 6";
    }

    /// foreach to sum an array
    static void sumArray(int[] a) {
        int s = 0;
        for (Integer n : a) {
            s += n;
        }
        assert s == 6 : "should be 6";
    }

    public static void main(String[] args) {
        sumForeach();
        sumIterator();
        sumArray(new int[] {1, 2, 3});
    }

}
