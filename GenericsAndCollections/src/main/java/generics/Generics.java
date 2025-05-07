
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.1 Generics
 * Raw types vs. generic types
 * @author emaph
 */
public class Generics {

    static void generics() {
        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello world!");
    }

    // Using raw types
    static void rawTypes() {
        List words = new ArrayList();
        words.add("Hello ");
        words.add("world!");
        String s = ((String)words.get(0)) + ((String)words.get(1));
        assert s.equals("Hello world!");
    }

    public static void main(String[] args) {
        generics();
        rawTypes();
    }
}

/*
 Implementing generics by erasure has a number of important effects. It keeps things
 simple, in that generics do not add anything fundamentally new. It keeps things small,
 in that there is exactly one implementation of List, not one version for each type. And
 it eases evolution, since the same library can be accessed in both nongeneric and generic
 forms.

 There is no need to switch to generics all at once—you can evolve your code by
 updating just one package, class, or method at a time to start using generics.
*/
