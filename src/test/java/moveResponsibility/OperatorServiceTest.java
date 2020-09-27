package moveResponsibility;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OperatorServiceTest {
    @Test
    public void add_numbers() {
        assertThat(OperatorService.add(2,2)).isEqualTo(4);
    }

    @Test
    public void substract_numbers() {
        assertThat(OperatorService.subtract(2,2)).isEqualTo(0);
    }
}