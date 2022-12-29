import java.util.Scanner;

public class Addition extends Calculator implements Addable{
   public Scanner scan = new Scanner(System.in);

    public Addition(double firstNum, double secondNum, double result) {
       super(firstNum,secondNum,result);
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
    public String toString() {
        return getFirstNum() + " + " + getSecondNum() + " = " + getResult();
    }

    @Override
    public void add() {
        System.out.print("Что вы собираетесь сложить, введите число: ");
        firstNum = scan.nextInt();
        System.out.print("С чем вы его сложите, введите число: ");
        secondNum = scan.nextInt();
        result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);
    }


}
