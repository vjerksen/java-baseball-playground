package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Baseball {

    public Baseball() {
    }

    public boolean isSame(int num1, int num2) {
        if (num1 == num2) {
            return true;
        }
        return false;
    }

    public boolean isStrike(boolean same, boolean same1) {
        if (same == true && same1 == true) {
            return true;
        }
        return false;
    }

    public boolean isBall(boolean same, boolean same1) {
        if (same == true && same1 == false) {
            return true;
        }
        return false;
    }

    public boolean isNothing(boolean same, boolean same1) {
        if (same == false) {
            return true;
        }
        return false;
    }

    public int makeRandomThreeDigitNumber() {
        Random rand = new Random();
        int returnValue = 0;

        for (int i = 0; i < 3; i++) {
            returnValue = (returnValue * 10) + (rand.nextInt(9) + 1);
        }

        return returnValue;
    }

    public int isDuplicatedThreeDigitNumber(int num) {
        Set<Integer> set = makeCheckingDuplicatedNumberSet(num);

        return set.size();
    }

    public Set<Integer> makeCheckingDuplicatedNumberSet(int i) {
        Set<Integer> set = new HashSet<>();

        while (i > 0) {
            set.add(i % 10);
            i /= 10;
        }

        return set;
    }


}
