import java.util.Scanner;

public class Multiplication extends Calculator implements Multiplyable {
    public Scanner scan = new Scanner(System.in);

    public Multiplication(double firstNum, double secondNum, double result) {
        super(firstNum, secondNum, result);
    }

    @Override
    public double getResult() {
        return result;
    }

    @Override
    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    @Override
    public double getSecondNum() {
        return secondNum;
    }

    @Override
    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return getFirstNum() + " * " + getSecondNum() + " = " + getResult();
    }


    @Override
    public void multiply() {
        System.out.print("Какое число вы будете умножать, введите число: ");
        firstNum = scan.nextInt();
        System.out.print("На сколько вы будете умножать, введите число: ");
        secondNum = scan.nextInt();
        result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);
    }
}
