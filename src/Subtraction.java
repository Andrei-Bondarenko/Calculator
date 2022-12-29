import java.util.Scanner;

public class Subtraction extends Calculator implements Subtractable {
    public Scanner scan = new Scanner(System.in);

    public Subtraction(double firstNum, double secondNum, double result) {
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
        return getFirstNum() + " + " + getSecondNum() + " = " + getResult() + "\n";
    }

    @Override
    public void subtract() {
        System.out.print("От чего вы будете вычитать, введите число: ");
        firstNum = scan.nextInt();
        System.out.print("Что вы будете вычитать из него, введите число: ");
        secondNum = scan.nextInt();
        result = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + result);
    }
}
