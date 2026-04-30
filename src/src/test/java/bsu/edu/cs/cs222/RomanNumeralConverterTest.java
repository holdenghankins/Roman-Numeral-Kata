package bsu.edu.cs.cs222;

import org.junit.jupiter.api.Test;

/**
 * Each test case is based around a numeral in the roman numeral system
 * Each test case checks the numeral, one below, and one above (except for 1)
 */
public class RomanNumeralConverterTest {

    @Test
    public void testOne() {
        assert (RomanNumeralConverter.convert(1).equals("I"));
        assert (RomanNumeralConverter.convert(3).equals("III"));
    }

    @Test
    public void testFive() {
        assert (RomanNumeralConverter.convert(5).equals("V"));
        assert (RomanNumeralConverter.convert(4).equals("IV"));
        assert (RomanNumeralConverter.convert(8).equals("VIII"));
    }

    @Test
    public void testTen() {
        assert (RomanNumeralConverter.convert(10).equals("X"));
        assert (RomanNumeralConverter.convert(9).equals("IX"));
        assert (RomanNumeralConverter.convert(34).equals("XXXIV"));
    }

    @Test
    public void testFifty() {
        assert (RomanNumeralConverter.convert(50).equals("L"));
        assert (RomanNumeralConverter.convert(45).equals("XLV"));
        assert (RomanNumeralConverter.convert(79).equals("LXXIX"));
    }

    @Test
    public void testHundred() {
        assert (RomanNumeralConverter.convert(100).equals("C"));
        assert (RomanNumeralConverter.convert(99).equals("XCIX"));
        assert (RomanNumeralConverter.convert(303).equals("CCCIII"));
    }

    @Test
    public void testFiveHundred() {
        assert (RomanNumeralConverter.convert(500).equals("D"));
        assert (RomanNumeralConverter.convert(495).equals("CDXCV"));
        assert (RomanNumeralConverter.convert(787).equals("DCCLXXXVII"));
    }

    @Test
    public void testThousandths() {
        assert (RomanNumeralConverter.convert(1000).equals("M"));
        assert (RomanNumeralConverter.convert(949).equals("CMXLIX"));
        assert (RomanNumeralConverter.convert(2782).equals("MMDCCLXXXII"));
    }

    /**
     * Tests possible errors
     */

    @Test
    public void testZero() {
        assert (RomanNumeralConverter.convert(0).isEmpty());
    }

    @Test
    public void testNegative() {
        assert (RomanNumeralConverter.convert(-17).isEmpty());
    }

    @Test
    public void testOverThreeThousand() {
        assert (RomanNumeralConverter.convert(3001).isEmpty());
    }

    @Test
    public void testBitLimit() {
        assert (RomanNumeralConverter.convert(Integer.MAX_VALUE).isEmpty());
        assert (RomanNumeralConverter.convert(Integer.MIN_VALUE).isEmpty());
    }
}
