import java.util.Scanner;

public class Degree extends Calculator implements Divideable {
    public Scanner scanner = new Scanner(System.in);

    Degree(double firstNum, double secondNum, double result) {
        super(firstNum,secondNum,result);
    }
@Override
    public double getFirstNum() {
        return firstNum;
    }
@Override
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
    public double getResult() {
        return result;
    }
    @Override
    public void setResult(double result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return getFirstNum() + " : " + getSecondNum() + " = " + getResult() + "\n";
    }


    @Override
    public void divide() {
        System.out.print("Какое число вы будете делить, введите число: ");
        firstNum = scanner.nextInt();
        System.out.print("На сколько вы будете делить, введите число: ");
        secondNum = scanner.nextInt();
        if (secondNum != 0) {
            result = firstNum / secondNum;
            System.out.println(firstNum + " : " + secondNum + " = " + result);
        } else System.out.println("На 0 делить нельзя!!!");
    }
}
