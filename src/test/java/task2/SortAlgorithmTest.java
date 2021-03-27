import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task2.SortAlgorithm;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmTest {
    @Test
    public void differentNumberOfElement() {
        int evenExcepted[] = {4, 6, 10, 12, 15, 23, 28, 35};
        int oddExcepted[] = {4, 6, 10, 12, 15, 23, 35};

        int[] evenActual = new SortAlgorithm(new int[]{12, 15, 23, 4, 6, 10, 35, 28}).msort();
        int[] oddActual = new SortAlgorithm(new int[]{12, 15, 23, 4 , 6, 10, 35}).msort();

        assertTrue(Arrays.equals(evenExcepted, evenActual));
        assertTrue(Arrays.equals(oddExcepted, oddActual));
    }

    @Test
    public void emptyArray() {
        int[] actual = new SortAlgorithm(new int[]{}).msort();

        assertTrue(Arrays.equals(actual, new int[]{}));
        assertEquals(0, actual.length);
    }

    @Test
    public void alreadySorted() {
        int excepted[] = {4, 6, 10, 12, 15, 23, 28, 35};

        int[] actual = new SortAlgorithm(new int[]{4, 6, 10, 12, 15, 23, 28, 35}).msort();

        assertTrue(Arrays.equals(excepted, actual));
    }

    @Test
    public void reverseSorted() {
        int excepted[] = {4, 6, 10, 12, 15, 23, 28, 35};

        int[] actual = new SortAlgorithm(new int[]{35, 28, 23, 15, 12, 10, 6, 4}).msort();

        assertTrue(Arrays.equals(excepted, actual));
    }

    @Test
    public void oneOrTwoElements() {
        int exceptedOne[] = {12};
        int exceptedTwo[] = {4, 12};

        int[] actualOne = new SortAlgorithm(new int[]{12}).msort();
        int[] actualTwo = new SortAlgorithm(new int[]{12, 4}).msort();

        assertTrue(Arrays.equals(exceptedOne, actualOne));
        assertTrue(Arrays.equals(exceptedTwo, actualTwo));
    }

    @Test
    public void largeSize() {
        int excepted[] = {4, 6, 10, 12, 15, 23, 28, 35, 60, 75, 100, 111, 130, 222, 235, 333, 345, 444, 500, 554, 666, 777, 800, 888, 1000};

        int[] actual = new SortAlgorithm(new int[]{12, 15, 23, 4 , 6, 10, 35, 28, 100, 130, 500, 1000, 235, 554, 75, 345, 800, 222, 333, 888, 444, 111, 666, 777, 60}).msort();

        assertTrue(Arrays.equals(excepted, actual));
    }

    @Test
    public void withNegativeElements() {
        int excepted[] = {-35, -23, -4, 6, 10, 12, 15, 28};

        int[] actual = new SortAlgorithm(new int[]{12, 15, -23, -4 , 6, 10, -35, 28}).msort();

        assertTrue(Arrays.equals(excepted, actual));
    }

    @Test
    public void duplicateElements() {
        int excepted1[] = {-35, 4, 6, 6, 10, 12, 12, 23, 28};
        int excepted2[] = {12, 12, 12, 12, 12};

        int[] actual1 = new SortAlgorithm(new int[]{12, 12, 23, 4 , 6, 6, 10, -35, 28}).msort();
        int[] actual2 = new SortAlgorithm(new int[]{12, 12, 12, 12, 12}).msort();

        assertTrue(Arrays.equals(excepted1, actual1));
        assertTrue(Arrays.equals(excepted2, actual2));
    }

    @Test
    public void partOfArray(){
        int start = 0;
        int end = 3;
        int excepted[] = {15, 23, 28, 35};

        int[] actual = new SortAlgorithm(new int[]{35, 28, 23, 15, 12, 10, 6, 4}, start, end).msort();

        assertTrue(Arrays.equals(excepted, Arrays.copyOfRange(actual, start, end + 1)));
    }
}