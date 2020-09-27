package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    private BigDecimal grossAmount;
    private BigDecimal taxPercentage;

    public Invoice(String amount, String tax) {
        this.grossAmount = new BigDecimal(amount);
        this.taxPercentage = new BigDecimal(tax);
    }

    public String calculateNetAmount() {
        return grossAmount
                .subtract(grossAmount
                        .multiply(taxPercentage
                                .divide(new BigDecimal("100")))).toString();
    }
}
