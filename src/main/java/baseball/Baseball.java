package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Baseball {

    final int TOT_BALL_COUNT = 3;

    public int isSame(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        }
        return 0;
    }


    public int isStrike(Ball ball1, Ball ball2) {
        int returnValue = 0;

        for (int i = 0; i < TOT_BALL_COUNT; i++) {
            returnValue += isSame(ball1.getBallArray(i), ball2.getBallArray(i));
        }

        return returnValue;
    }

    public int isBall(Ball ball1, Ball ball2) {
        int returnValue = 0;

        for (int i = 0; i < TOT_BALL_COUNT; i++) {
            returnValue += isSame(ball1.getBallArray(i), ball2.getBallArray((i + 1) % 3));
            returnValue += isSame(ball1.getBallArray(i), ball2.getBallArray((i + 2) % 3));
        }

        return returnValue;
    }

    public int makeRandomThreeDigitNumber() {
        Random rand = new Random();
        int returnValue = 0;

        for (int i = 0; i < TOT_BALL_COUNT; i++) {
            returnValue = (returnValue * 10) + (rand.nextInt(9) + 1);
        }

        return returnValue;
    }

    public int isDuplicatedThreeDigitNumber(int num) {
        Set<Integer> set = makeCheckingDuplicatedNumberSet(num);

        return set.size();
    }

    public Set<Integer> makeCheckingDuplicatedNumberSet(int num) {
        Set<Integer> set = new HashSet<>();

        while (num > 0) {
            set.add(num % 10);
            num /= 10;
        }

        return set;
    }

    public Ball insertIdxAndNum(int num) {
        Ball testBall = new Ball();
        int idx = 0;

        testBall.setBallNumber(num);
        while (num > 0) {
            testBall.setBallArray(idx, num % 10);
            num /= 10;
        }

        return testBall;
    }
}
