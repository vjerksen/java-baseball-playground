package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @DisplayName("공백을 기준으로 문자열 분리")
    @Test
    void splitByBlankTest() {
        String inputStr = "1 + 2 / 3 * 10";

        String[] splittedStr = calculator.splitByBlank(inputStr);

        assertThat(splittedStr[0]).isEqualTo("1");
        assertThat(splittedStr[1]).isEqualTo("+");
        assertThat(splittedStr[2]).isEqualTo("2");
        assertThat(splittedStr[3]).isEqualTo("/");
        assertThat(splittedStr[4]).isEqualTo("3");
        assertThat(splittedStr[5]).isEqualTo("*");
        assertThat(splittedStr[6]).isEqualTo("10");
    }

    @DisplayName("더하기 연산")
    @Test
    void calculatePlusTest() {
        double num1 = 12;
        double num2 = 23;

        assertThat(calculator.calculatePlus(num1, num2)).isEqualTo(num1 + num2);
    }

    @DisplayName("빼기 연산")
    @Test
    void calculateMinusTest() {
        double num1 = 12;
        double num2 = 23;

        assertThat(calculator.calculateMinus(num1, num2)).isEqualTo(num1 - num2);
    }

    @DisplayName("곱하기 연산")
    @Test
    void calculateMulipleTest() {
        double num1 = 12;
        double num2 = 23;

        assertThat(calculator.calculateMultiple(num1, num2)).isEqualTo(num1 * num2);
    }

    @DisplayName("나누기 연산")
    @Test
    void calculateDivideTest() {
        double num1 = 21;
        double num2 = 0;

        assertThat(calculator.calculateDivide(num1, num2)).isEqualTo(num1 / num2);
    }

    @DisplayName("문자열을 숫자로 변환하는 로직")
    @Test
    void strToNumTest() {
        String str = "123";
        double num = 123;
        assertThat(calculator.strToNum(str)).isEqualTo(num);
    }

    @DisplayName("연산자 구분하는 로직")
    @Test
    void checkOperatorTest() {
        String plusOperator = "+";
        String minusOperator = "-";
        String multipleOperator = "*";
        String divideOperator = "/";
        double num1 = 12;
        double num2 = 23;

        assertThat(calculator.checkOperator(num1, num2, plusOperator)).isEqualTo(num1 + num2);
        assertThat(calculator.checkOperator(num1, num2, minusOperator)).isEqualTo(num1 - num2);
        assertThat(calculator.checkOperator(num1, num2, multipleOperator)).isEqualTo(num1 * num2);
        assertThat(calculator.checkOperator(num1, num2, divideOperator)).isEqualTo(num1 / num2);
    }
}
