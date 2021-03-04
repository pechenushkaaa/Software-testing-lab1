package task1;

import task1.exceptions.FactorialValueOverflowException;

public class MathFunctions {
    public static long factorial(int n) throws FactorialValueOverflowException {
        long result = 1;

        while (n > 0) {
            result *= n;
            if (result < 0) throw new FactorialValueOverflowException();
            n--;
        }

        return result;
    }
}
