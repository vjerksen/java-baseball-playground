package baseball;

import java.util.Scanner;

public class BaseballGame {

    private Baseball baseball = new Baseball();
    private Ball randomBall = new Ball();
    private Ball inputBall = new Ball();
    private Scanner scanner = new Scanner(System.in);


    public void main(String[] args) {
        init();

        // 맞출 떄 까지 게임 진행
        while (play() == true) {};
    }


    private void init() {
        while (makeRandomNumber()) {};

        while (makeInputNumber()) {};
    }

    private boolean makeRandomNumber() {
        boolean isTrue = false;
        int chkValue = 0;

        chkValue = baseball.makeRandomThreeDigitNumber();

        if (baseball.isDuplicatedThreeDigitNumber(chkValue) == 3) {
            isTrue = true;
        }

        return isTrue;
    }

    private boolean makeInputNumber() {
        boolean isTrue = false;
        int chkValue = 0;

        System.out.print("숫자를 입력해주세요 : ");
        chkValue = scanner.nextInt();

        if (baseball.isDuplicatedThreeDigitNumber(chkValue) == 3) {
            isTrue = true;
        }

        return isTrue;
    }

    private boolean play() {
        boolean isAllStrike = false;

        // 숫자 맞추는 게임 로직


        return isAllStrike;
    }
}
