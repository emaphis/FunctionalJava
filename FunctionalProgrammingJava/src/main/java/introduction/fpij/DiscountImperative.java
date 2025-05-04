
package introduction.fpij;

import static introduction.fpij.Prices.prices;

/**
 * Beyond Simple Cases
 * The Old Way
 * @author emaph
 */
public class DiscountImperative {

    public static void main(String[] args) {
        double totalOfDiscountPrices = 0.0;

        for (int price : prices) {
            if (price > 20) {
                totalOfDiscountPrices += price * 0.9;
            }
        }

        System.out.println("Total of discounted prices; " + totalOfDiscountPrices);
    }
}

/*
Total of discounted prices; 67.5
*/