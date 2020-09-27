package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Price> prices = new ArrayList<>();

    public void add(Price price){
        this.prices.add(price);
    }

    public Price calculateTotalPrice() {
        int result = 0;
        for (Price price: prices) {
            result = price.getValue();
        }
        return new Price(result);
    }

    public boolean hasDiscount() {
        return calculateTotalPrice().getValue() >= 100;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
