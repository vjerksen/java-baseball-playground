package baseball;

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
}
