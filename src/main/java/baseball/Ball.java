package baseball;

import java.util.ArrayList;

public class Ball {

    private int ballNumber;
    private ArrayList<Integer> ballArray;

    public Ball() {
        this.ballArray = new ArrayList<>(3);
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public int getBallArray(int idx) {
        return ballArray.get(idx);
    }

    public void setBallArray(int idx, int ballNum) {
        this.ballArray.add(idx, ballNum);
    }
}
