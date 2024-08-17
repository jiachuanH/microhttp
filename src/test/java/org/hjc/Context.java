package org.hjc;

public class Context {
    public Calc calc;

    public Context(Calc calc) {
        this.calc = calc;
    }

    public int execCalc(int num1, int num2) {
        return calc.calc(num1, num2);
    }

    public static void main(String[] args) {
        Calc calc1 = new Plus();
        Calc calc2 = new Subtr();
        Context context = new Context(calc2);
        System.out.println(context.execCalc(12, 4));
    }

}
