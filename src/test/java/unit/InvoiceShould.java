package unit;

import moveResponsibility.Invoice;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvoiceShould {

    @Test
    public void calculate_net_amount() throws Exception {
        Invoice invoice = new Invoice("100", "10");

        String result = invoice.calculateNetAmount();

        assertThat(result).isEqualTo("90.0");
    }
}
