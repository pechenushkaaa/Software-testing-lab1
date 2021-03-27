package task1;

import task1.TaylorSeries;
import static org.junit.jupiter.api.Assertions.*;

import task1.exceptions.EpsilonLimitException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TaylorSeriesTest {
    private static TaylorSeries actual;
    private static final double ACCURACY = 0.00001;

    @BeforeAll
    public static void setup() {
        actual = new TaylorSeries(9);
    }

    @Test
     public void secBorderConditionsEquality() throws EpsilonLimitException {
        assertEquals(1.0, actual.sec(0), ACCURACY);
        assertThrows(ArithmeticException.class, () -> actual.sec(Math.PI / 2));
        assertEquals(-1.0, actual.sec(Math.PI), ACCURACY);
        assertThrows(ArithmeticException.class, () -> actual.sec(-Math.PI / 2));
    }

    @Test
    public void secOtherConditionsEquality() throws EpsilonLimitException {
        assertEquals(Math.sqrt(2), actual.sec(Math.PI / 4), ACCURACY);
        assertEquals(2, actual.sec(Math.PI / 3), ACCURACY);
        assertEquals(2 * Math.sqrt(3) / 3, actual.sec(Math.PI / 6), ACCURACY);
    }

    @Test
    public void whenEpsilonLimitExcepted_getFinalResultInExceptionMessages(){
        TaylorSeries actual = new TaylorSeries(21);

        Exception actualException = assertThrows(EpsilonLimitException.class, () -> actual.sec(13));

        String expectedMessage = "Result with max epsilon limit:";
        assertTrue(actualException.getMessage().contains(expectedMessage));
    }

}