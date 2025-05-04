
package introduction.fpij;

import static introduction.fpij.Prices.prices;

/**
 * Beyond Simple Cases
 * A Better Way, Again
 * @author emaph
 */
public class DiscountFunctional {

    public static void main(String[] args) {
        final double totalOfDiscountPrices =
            prices.stream()
                .filter(price -> price > 2)
                .mapToDouble(price -> price * 0.9)
                .sum();

        System.out.println("Total of discounted prices; " + totalOfDiscountPrices);
    }
}

/*
Total of discounted prices; 67.5
*/