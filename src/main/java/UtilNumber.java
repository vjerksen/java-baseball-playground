public class UtilNumber {

    public static final int MIN_NUM = 0;
    public static final int MAX_NUM = 10;

    public boolean isValidNumber(int inputNumber) {
        boolean returnValue = false;

        if (MIN_NUM < inputNumber && inputNumber < MAX_NUM) {
            returnValue = true;
        }

        return returnValue;
    }
}
