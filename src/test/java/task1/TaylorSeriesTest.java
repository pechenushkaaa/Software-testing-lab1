
import task1.TaylorSeries;
import static org.junit.jupiter.api.Assertions.*;

import task1.exceptions.EpsilonLimitException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TaylorSeriesTest {
    private static TaylorSeries actual;

    @BeforeAll
    public static void setup() {
        actual = new TaylorSeries(9);
    }

    @Test
     public void secBorderConditionsEquality() throws EpsilonLimitException {
        assertEquals(1.0, actual.sec(0), 0.0001);
        assertThrows(ArithmeticException.class, () -> actual.sec(Math.PI / 2));
        assertEquals(-1.0, actual.sec(Math.PI), 0.0001);
        assertThrows(ArithmeticException.class, () -> actual.sec(-Math.PI / 2));
    }

    @Test
    public void secOtherConditionsEquality() throws EpsilonLimitException {
        assertEquals(Math.sqrt(2), actual.sec(Math.PI / 4), 0.0001);
        assertEquals(2, actual.sec(Math.PI / 3), 0.0001);
        assertEquals(2 * Math.sqrt(3) / 3, actual.sec(Math.PI / 6), 0.0001);
    }

    @Test
    public void whenEpsilonLimitExcepted_getFinalResultInExceptionMessages(){
        TaylorSeries actual = new TaylorSeries(21);

        Exception actualException = assertThrows(EpsilonLimitException.class, () -> actual.sec(13));

        String expectedMessage = "Result with max epsilon limit:";
        assertTrue(actualException.getMessage().contains(expectedMessage));
    }

}