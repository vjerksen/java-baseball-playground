package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

    Baseball baseball = new Baseball();
    Ball ball1 = new Ball();
    Ball ball2 = new Ball();

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

    @DisplayName("숫자가 같은 지 확인하는 로직")
    @Test
    void isSameTest() {
        int num1 = 1;
        int num2 = 1;

        assertThat(baseball.isSame(num1, num2)).isTrue();
    }
}
