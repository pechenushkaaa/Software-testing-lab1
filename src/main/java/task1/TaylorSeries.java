package task1;

import task1.exceptions.EpsilonLimitException;
import task1.exceptions.FactorialValueOverflowException;
import static task1.MathFunctions.factorial;

public class TaylorSeries {
    private int N;

    public TaylorSeries(int n) {
        N = n;
    }

    public double sec(double x) throws EpsilonLimitException {
        double result = 0;

        if (Math.abs(x) == Math.PI / 2) throw new ArithmeticException();

        try {
            for (int i = 0; i <= N; i++) result += Math.pow(-1.0, i) * Math.pow(x, 2.0 * i) / factorial(2 * i);

        } catch (FactorialValueOverflowException e){
            throw new EpsilonLimitException("Result with max epsilon limit: " + 1 / result);
        }



        return 1 / result;
    }

}
