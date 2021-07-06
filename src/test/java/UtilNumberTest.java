import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilNumberTest {

    @DisplayName("숫자 유효성 체크")
    @Test
    void numberValidTest() {
        UtilNumber utilNumber = new UtilNumber();
        boolean chkValid = utilNumber.isValidNumber(1);

        assertThat(chkValid).isTrue();
    }
}
