package baseball;

import java.util.Scanner;

public class BaseballGame {

    private static Baseball baseball;
    private static Ball randomBall;
    private static Ball inputBall;
    private static Scanner scanner;
    final static int TOT_BALL_COUNT = 3;

    public static void main(String[] args) {
        initBaseballGame();

        while (playBaseballGame() == false) {};
    }

    private static void initBaseballGame() {
        baseball = new Baseball();
        scanner = new Scanner(System.in);
        randomBall = new Ball();
        inputBall = new Ball();
    }

    private static boolean playBaseballGame() {
        boolean chkEndThisGame = false;

        while (makeRandomNumber() == false) {};
        randomBall = baseball.insertIdxAndNum(randomBall.getBallNumber());

        while (isCorrect() == false) {};

        if (askEndGame() == true) {
            chkEndThisGame = true;
        }

        return chkEndThisGame;
    }

    private static boolean isCorrect() {
        boolean chkCorrect = false;
        int strikeCount = 0;
        int ballCount = 0;

        while (makeInputNumber() == false) {};
        inputBall = baseball.insertIdxAndNum(inputBall.getBallNumber());


        strikeCount += baseball.isStrike(inputBall, randomBall);
        ballCount += baseball.isBall(inputBall, randomBall);

        printResult(strikeCount, ballCount);

        if (strikeCount == TOT_BALL_COUNT) {
            chkCorrect = true;
        }

        return chkCorrect;
    }

    private static boolean makeRandomNumber() {
        boolean isTrue = false;
        int chkValue = 0;

        chkValue = baseball.makeRandomThreeDigitNumber();

        if (baseball.isDuplicatedThreeDigitNumber(chkValue) == TOT_BALL_COUNT) {
            randomBall.setBallNumber(chkValue);
            isTrue = true;
        }

        return isTrue;
    }

    private static boolean makeInputNumber() {
        boolean isTrue = false;
        int chkValue = 0;

        System.out.print("숫자를 입력해주세요 : ");
        chkValue = scanner.nextInt();

        if (baseball.isDuplicatedThreeDigitNumber(chkValue) == TOT_BALL_COUNT) {
            inputBall.setBallNumber(chkValue);
            isTrue = true;
        }

        return isTrue;
    }

    private static boolean askEndGame() {
        boolean answer = false;
        int chkValue = 0;

        System.out.println("3개의 숫자를 모두 맞추셨습니다. 게임종료!");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        chkValue = scanner.nextInt();

        if (chkValue == 2) {
            answer = true;
        }

        return answer;
    }

    private static void printResult(int strikeCount, int ballCount) {
        System.out.println("randomNumer : " + randomBall.getBallNumber() + ", inputNumber : " + inputBall.getBallNumber());
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("낫싱");
        }
        if (strikeCount != 0 || ballCount != 0 ) {
            System.out.println(ballCount + "볼, " + strikeCount + "스트라이크");
        }
    }
}
