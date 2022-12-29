import java.util.Scanner;

public class Calculator {
    public double firstNum;
    public double secondNum;
    public double result;
    public Scanner scanner = new Scanner(System.in);

    public Calculator(double firstNum, double secondNum, double result) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;

    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String toString() {
        return getFirstNum() + " : " + getSecondNum() + " = " + getResult() + "\n";
    }

    public void work() {
        Multiplication multiply = new Multiplication(0, 0, 0);
        Degree degree = new Degree(0, 0, 0);
        Addition add = new Addition(0, 0, 0);
        Subtraction subtraction = new Subtraction(0, 0, 0);
        int finishNum;
        do {
            System.out.println("Какое действие вы хотите выполнить? " + "\n1 - Умножение" + "\n2 - Деление" + "\n3 - Сложение" + "\n4 - Вычитание");
            int number = scanner.nextInt();
            if (number == 1) {
                multiply.multiply();
            } else if (number == 2) {
                degree.divide();
            } else if (number == 3) {
                add.add();
            } else if (number == 4) {
                subtraction.subtract();
            }
            System.out.println("Введите число: " + "\n1 - чтобы закончить вычисления " + "\n2 - чтобы продолжить");
            finishNum = scanner.nextInt();
        }while (finishNum ==2);

    }
}
