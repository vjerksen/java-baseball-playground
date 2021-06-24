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

        assertThat(baseball.isSame(num1, num2)).isTrue();
    }

    @DisplayName("스트라이크 여부 확인하는 로직")
    @Test
    void isStrikeTest() {
        ball1.setBallNum(1);
        ball1.setPosition(1);
        ball2.setBallNum(1);
        ball2.setPosition(1);

        assertThat(baseball.isStrike(baseball.isSame(ball1.getBallNum(), ball2.getBallNum()), baseball.isSame(ball1.getPosition(), ball2.getPosition()))).isTrue();
    }

    @DisplayName("볼 여부 확인하는 로직")
    @Test
    void isBallTest() {
        ball1.setBallNum(1);
        ball1.setPosition(1);
        ball2.setBallNum(1);
        ball2.setPosition(2);

        assertThat(baseball.isBall(baseball.isSame(ball1.getBallNum(), ball2.getBallNum()), baseball.isSame(ball1.getPosition(), ball2.getPosition()))).isTrue();
    }

    @DisplayName("낫싱 여부 확인하는 로직")
    @Test
    void isNothingTest() {
        ball1.setBallNum(1);
        ball1.setPosition(1);
        ball2.setBallNum(2);
        ball2.setPosition(1);

        assertThat(baseball.isNothing(baseball.isSame(ball1.getBallNum(), ball2.getBallNum()), baseball.isSame(ball1.getPosition(), ball2.getPosition()))).isTrue();
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
}
