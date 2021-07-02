package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

    Baseball baseball = new Baseball();
    Ball ball1 = new Ball();
    Ball ball2 = new Ball();

    @DisplayName("숫자가 같은 지 확인하는 로직")
    @Test
    void isSameTest() {
        int num1 = 1;
        int num2 = 1;

        assertThat(baseball.isSame(num1, num2)).isEqualTo(1);
    }

    @DisplayName("스트라이크 여부 확인하는 로직")
    @Test
    void isStrikeTest() {
        ball1.setBallArray(0, 1);
        ball1.setBallArray(1, 2);
        ball1.setBallArray(2, 3);
        ball2.setBallArray(0, 1);
        ball2.setBallArray(1, 2);
        ball2.setBallArray(2, 3);

        assertThat(baseball.isStrike(ball1, ball2)).isEqualTo(3);
    }

    @DisplayName("볼 여부 확인하는 로직")
    @Test
    void isBallTest() {
        ball1.setBallArray(0, 1);
        ball1.setBallArray(1, 2);
        ball1.setBallArray(2, 3);
        ball2.setBallArray(0, 2);
        ball2.setBallArray(1, 3);
        ball2.setBallArray(2, 1);

        assertThat(baseball.isBall(ball1, ball2)).isEqualTo(3);
    }

    @DisplayName("세 자리 숫자 랜덤으로 생성하는 로직")
    @Test
    void makeRandomThreeDigitNumber() {
        int num = baseball.makeRandomThreeDigitNumber();
        assertThat(num).isLessThan(1001);
        assertThat(num).isGreaterThan(99);
    }

    @DisplayName("세 자리 숫자 나눠서 set에 넣는 로직")
    @Test
    void makeCheckingDuplicatedNumberSetTest() {
        int num = 123;

        assertThat(baseball.makeCheckingDuplicatedNumberSet(num)).contains(1);
        assertThat(baseball.makeCheckingDuplicatedNumberSet(num)).contains(2);
        assertThat(baseball.makeCheckingDuplicatedNumberSet(num)).contains(3);
    }

    @DisplayName("각 자리 수가 서로 다른 수로 이루어진 것 확인하는 로직")
    @Test
    void isDuplicatedThreeDigitNumberTest() {
        int num = 132;
        assertThat(baseball.isDuplicatedThreeDigitNumber(num)).isEqualTo(3);
    }

    @DisplayName("숫자에서 자리 수와 값을 추출해서 저장하는 로직")
    @Test
    void insertIdxAndNumTest() {
        int num = 123;
        Ball testBall = baseball.insertIdxAndNum(num);

        assertThat(testBall.getBallArray(0)).isEqualTo(1);
        assertThat(testBall.getBallArray(1)).isEqualTo(2);
        assertThat(testBall.getBallArray(2)).isEqualTo(3);
    }
}
