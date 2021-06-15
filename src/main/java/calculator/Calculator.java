package calculator;

public class Calculator {

    private String inputStr;

    public String getInputStr() {
        return inputStr;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String[] splitByBlank(String inputStr) {
        String[] strList = inputStr.split(" ");
        return strList;
    }

    public double calculatePlus(double num1, double num2) {
        return num1 + num2;
    }

    public double calculateMinus(double num1, double num2) {
        return num1 - num2;
    }

    public double calculateMultiple(double num1, double num2) {
        return num1 * num2;
    }

    public double calculateDivide(double num1, double num2) {
        return num1 / num2;
    }

    public double strToNum(String str) {
        return Double.parseDouble(str);
    }

    public double checkOperator(double num1, double num2, String operator) {
        double returnValue = 0;
        if(operator.equals("+")) {
            returnValue = this.calculatePlus(num1, num2);
        }
        if(operator.equals("-")) {
            returnValue = this.calculateMinus(num1, num2);
        }
        if(operator.equals("*")) {
            returnValue = this.calculateMultiple(num1, num2);
        }
        if(operator.equals("/")) {
            returnValue = this.calculateDivide(num1, num2);
        }
        return returnValue;
    }
}
