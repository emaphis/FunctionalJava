
package generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Introductory example pg.3
 * @author emaph
 */
public class Introduction {

    static void generic() {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n : ints) { s += n; }
        assert s == 6;
    }

    // Has warnings
    static void nonGeneric() {
        List ints = Arrays.asList(new Integer[] { 1, 2, 3 });
        int s = 0;
        for (Iterator it = ints.iterator(); it.hasNext();) {
            int n = ((Integer)it.next());
            s += n;
        }
        assert s == 6;
    }


    // Java 1.0
    static void useArray() {
        int[] ints = new int[] { 1, 2, 3 };
        int s = 0;
        for (int i = 0; i < ints.length; i++) { s += ints[i]; }
        assert s == 6;
    }

    public static void main(String[] args) {
        generic();
        nonGeneric();
        useArray();
    }
}
