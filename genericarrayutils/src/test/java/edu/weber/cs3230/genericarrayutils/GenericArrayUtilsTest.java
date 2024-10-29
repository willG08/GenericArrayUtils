package edu.weber.cs3230.genericarrayutils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenericArrayUtilsTest {

    private GenericArrayUtils<Integer> arrayUtilsInt;
    private GenericArrayUtils<Character> arrayUtilsChar;
    private GenericArrayUtils<Double> arrayUtilsDouble;


    @BeforeEach
    void initInput()
    {
        Integer[] a = { 0, 1, 2, 3, 4, 5, 6 };
        Character[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        Double[] c = { 1.0, 2.0, 3.3, 5.8, 7.9, 12.1 };
        arrayUtilsInt = new GenericArrayUtils<>(Integer.class, a);
        arrayUtilsChar = new GenericArrayUtils<>(Character.class, b);
        arrayUtilsDouble = new GenericArrayUtils<>(Double.class, c);
    }

    @Test
    void testGetEveryOtherElements()
    {
        Integer[] expectedIntEven = { 0, 2, 4, 6};
        Integer[] expectedIntOdd = { 1, 3, 5};
        Character[] expectedCharEven = { 'a', 'c', 'e', 'g'};
        Character[] expectedCharOdd = { 'b', 'd', 'f', 'h' };
        Double[] expectedDoubleEven = { 1.0, 3.3, 7.9};
        Double[] expectedDoubleOdd = { 2.0, 5.8, 12.1};

        assertArrayEquals(expectedIntEven, arrayUtilsInt.getEveryOtherElements(true));
        assertArrayEquals(expectedIntOdd, arrayUtilsInt.getEveryOtherElements(false));
        assertArrayEquals(expectedCharEven, arrayUtilsChar.getEveryOtherElements(true));
        assertArrayEquals(expectedCharOdd, arrayUtilsChar.getEveryOtherElements(false));
        assertArrayEquals(expectedDoubleEven, arrayUtilsDouble.getEveryOtherElements(true));
        assertArrayEquals(expectedDoubleOdd, arrayUtilsDouble.getEveryOtherElements(false));

    }

    @Test
    void testReverse()
    {
        Integer[] expectedInt = { 6, 5, 4, 3, 2, 1, 0 };
        Character[] expectedChar = { 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
        Double[] expectedDouble = { 12.1, 7.9, 5.8, 3.3, 2.0, 1.0 };

        assertArrayEquals(expectedInt, arrayUtilsInt.reverse());
        assertArrayEquals(expectedChar, arrayUtilsChar.reverse());
        assertArrayEquals(expectedDouble, arrayUtilsDouble.reverse());


    }


}
