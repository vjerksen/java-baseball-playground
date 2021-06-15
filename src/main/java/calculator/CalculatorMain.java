package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        double answer = 0;
        ArrayList<String> operandList = new ArrayList<>();
        ArrayList<String> operatorList = new ArrayList<>();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        calculator.setInputStr(scanner.nextLine());

        String[] splittedStr = calculator.splitByBlank(calculator.getInputStr());

        for (int i = 0; i < splittedStr.length; i+=2) {
            operandList.add(splittedStr[i]);
        }
        for (int i = 1; i < splittedStr.length; i+=2) {
            operatorList.add(splittedStr[i]);
        }

        answer = calculator.strToNum(operandList.get(0));
        for(int i = 0; i < operatorList.size(); i++) {
            answer = calculator.checkOperator(answer, calculator.strToNum(operandList.get(i + 1)), operatorList.get(i));
        }

        System.out.println(answer);
    }
}
